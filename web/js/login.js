var Password_var;
var Password2_var;
var name_var;
var reg_str = /^[a-zA-Z][\w]{5,9}$/;

var name_ok;
var Password_ok;
var Password2_ok;

function oBlur_name() {
    var name = document.getElementById("name").value;
    if (!name) { //用户框value值为空
        document.getElementById("alert_win").style.visibility="visible";
        document.getElementById("alert").innerHTML= "请输入昵称！";
    } else if (name.length > 20 || name.length < 6 || !reg_str.test(name))//用户框value值不为空
        {
            document.getElementById("alert_win").style.visibility="visible";
            document.getElementById("alert").innerHTML= "昵称请输入6-20位字符包括数字字母，且不能包含特殊字符";
    }else{
        document.getElementById("alert_win").style.visibility="hidden";
        name_var=name;
        name_ok="ok";
    }
}

//密码框失去焦点后验证value值
function oBlur_Password() {
    var Password = document.getElementById("Password").value;

    if (!Password) { //密码框value值为空
        document.getElementById("alert_win").style.visibility="visible";
        document.getElementById("alert").innerHTML= "请输入密码！";
    } else if (Password.length > 20 || Password.length < 6 || !reg_str.test(Password))//用户框value值不为空
    {
        document.getElementById("alert_win").style.visibility="visible";
        document.getElementById("alert").innerHTML= "密码请输入6-20位字符包括数字字母，且不能包含特殊字符";
    }else{
        document.getElementById("alert_win").style.visibility="hidden";
        Password_var=Password;
        Password_ok="ok";
    }
}

function oBlur_Password2() {
    var Password2 = document.getElementById("Password2").value;
    if (!Password2 || Password_ok !="ok") { //密码框value值为空
        document.getElementById("alert_win").style.visibility="visible";
        document.getElementById("alert").innerHTML= "请再次检查和输入密码！";
    } else if (Password2 !=Password_var  )
    {
        document.getElementById("alert_win").style.visibility="visible";
        document.getElementById("alert").innerHTML= "两次密码输入不相同！";
    }else{
        document.getElementById("alert_win").style.visibility="hidden";
        Password2_var=Password2;
        Password2_ok="ok";
    }
}

//若输入框为空，阻止表单的提交
function submitTest() {
    if (name_ok !="ok") { //用户框value值和密码框value值都为空
       alert("请按要求填写姓名");
       return false;
//只有返回true表单才会提交
    } else if (Password2_ok != "ok" || Password_ok != "ok") { //用户框value值为空
        alert("请按要求填写密码");
        return false;
    } else if (Password2_ok !=Password_ok) { //密码框value值为空
        alert("请按要求再次填写密码");
        return false;
    }
}
