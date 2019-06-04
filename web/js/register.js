var Password_var;
var Password2_var;
var name_var;
var q1_var;
var q2_var;
var a1_var;
var a2_var;

var user_str = /^{1,20}$/;
var reg_str = /^[a-zA-Z0-9_-]{6,16}$/;


var name_ok;
var Password_ok;
var Password2_ok;
var q1_ok;
var q2_ok;
var a1_ok;
var a2_ok;

function oBlur_name() {
    var name = document.getElementById("name").value;
    if (!name) { //用户框value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请输入昵称！";
    } else if (name.length > 20 || name.length < 1 || !user_str.test(name))//用户框value值不为空
    {
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "昵称不能包含特殊字符";
    } else {
        document.getElementById("alert_win").style.display = "none";
        name_var = name;
        name_ok = "ok";
    }
}

//密码框失去焦点后验证value值

function oBlur_Password() {
    var Password = document.getElementById("Password").value;

    if (!Password) { //密码框value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请输入密码！";
    } else if (Password.length > 20 || Password.length < 6 || !reg_str.test(Password))//用户框value值不为空
    {
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "密码请输入6-16位字符包括数字字母，且不能包含特殊字符";
    } else {
        document.getElementById("alert_win").style.display = "none";
        Password_var = Password;
        Password_ok = "ok";
    }
}


function oBlur_Password2() {
    var Password2 = document.getElementById("Password2").value;
    if (Password_ok != "ok") {
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "密码请输入6-16位字符包括数字字母，且不能包含特殊字符";
    } else if (!Password2) { //密码框value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请再次输入密码！";
    } else if (Password2 != Password_var) {
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "两次密码输入不相同！";
    } else {
        document.getElementById("alert_win").style.display = "none";
        Password2_var = Password2;
        Password2_ok = "ok";
    }
}


function oBlur_q1() {
    var q1 = document.getElementById("q1").value;
    if (!q1) { //密码框value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请选择密保问题1！";
    } else {
        document.getElementById("alert_win").style.display = "none";
        q1_var = q1;
        q1_ok = "ok";
    }
}

function oBlur_a1() {
    var a1 = document.getElementById("a1").value;
    if (!a1) { //密码框value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请填写密保答案1！";
    } else {
        document.getElementById("alert_win").style.display = "none";
        a1_var = a1;
        a1_ok = "ok";
    }
}


function oBlur_q2() {
    var q2 = document.getElementById("q2").value;
    if (!q2) { //密码框value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请选择密保问题2！";
    } else if (q2 == q1_var) {
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "密保问题不能相同！";
    } else {
        document.getElementById("alert_win").style.display = "none";
        q2_var = q2;
        q2_ok = "ok";
    }
}


function oBlur_a2() {
    var a2 = document.getElementById("a2").value;
    if (!a2) { //密码框value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请填写密保答案2！";
    } else {
        document.getElementById("alert_win").style.display = "none";
        a2_var = a2;
        a2_ok = "ok";
    }
}

//若输入框为空，阻止表单的提交
function submitTest() {
    if (name_ok != "ok") { //用户框value值和密码框value值都为空
        document.getElementById("alert").innerHTML = "请按要求填写name！";
        return false;
//只有返回true表单才会提交
    } else if (Password2_ok != "ok" || Password_ok != "ok") { //用户框value值为空
        document.getElementById("alert").innerHTML = "请按要求填写密码！";
        return false;
    } else if (a1_ok != "ok" || a2_ok != "ok" || q2_var == q1_var) { //用户框value值为空
        document.getElementById("alert").innerHTML = "请按要求填写密保！";
        return false;
    } else if (Password2_ok != Password_ok) { //密码框value值为空
        document.getElementById("alert").innerHTML = "请按要求再次填写密码！";
        return false;
    } else {
        document.getElementById("alert_win").style.display = "none";
        return true;
    }


}

