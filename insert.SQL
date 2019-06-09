INSERT INTO Users ( Userid, Upassword, Uquestion1, UQuestion2, UAnswer1, UAnswer2 )
                       VALUES
                       ( 1, 123456, "你喜欢看的电影？", "你的生日？", "肖申克的救赎", "5.18" ),(2,123456,"你最喜欢哪支球队？","你的初中班主任名字是什么？","猛龙","giao");

INSERT INTO BlogInfo ( Bid, Buid, Btext, Bdate, Bimage, Btitle )
                       VALUES
                       ( 0001, 1, "从明天起, 做一个幸福的人
                       喂马, 劈柴, 周游世界
                       从明天起, 关心粮食和蔬菜
                       我有一所房子, 面朝大海, 春暖花开
                       从明天起, 和每一个亲人通信
                       告诉他们我的幸福
                       那幸福的闪电告诉我的
                       我将告诉每一个人
                       给每一条河每一座山取一个温暖的名字
                       陌生人, 我也为你祝福
                       愿你有一个灿烂的前程
                       愿你有情人终成眷属
                       愿你在尘世获得幸福
                       我只愿面朝大海, 春暖花开", "2019-6-7", "images/img_30.jpg", "愿面朝大海, 春暖花开" );

UPDATE BlogInfo SET  Btext = REPLACE(REPLACE(Btext, CHAR(10), ''), CHAR(13), '');

INSERT INTO Comments ( Cid, Cfid, Cuid, Ctext, Ctime)
                      VALUES
                       ( 0001, 0001, 2, "你的生日？", "2019-6-7" ),(0002,0001,1,"你的初中班主任名字是什么？","2019-6-8");
INSERT INTO Thumbs_up ( Thbid, Tuid, Tdate)
                      VALUES
                      ( 0001, 1, "2019-6-7" ),(0001,2,"2019-6-8");
INSERT INTO Follow ( Fhuid, Fuid)
                      VALUES
                      ( 2, 1),(1,2);
INSERT INTO Collect ( Cbid , Cuid, Ctime)
                      VALUES
                      ( 0001, 1, "2019-6-7" ),(0001,2,"2019-6-8");
INSERT INTO UserInfo ( Uid, Ugender, Uage, Ucontact,Uname,Uaddress,Uemail,UidentityNumber,Uimage,Uhobby,Uschool,Ugrade)
                       VALUES
                       ( 1, 17, 19, 17852423220, "想吃肉的小绵羊", "青岛","783487703@qq.com",370828200005180013,"img_2.jpg","唱跳rap篮球","青岛大学","猛龙");
INSERT INTO School ( Suid,Spschool,Smschool,Shschool,Suschool,Spgrade,Smgrade,Shgrade,Sugrade)
                       VALUES
                       ( 1, "中心小学", "希望中学","ok高中", "青岛大学", 2005,2011,2014,2017);
INSERT INTO Message ( Mid,Mruid,Msuid,Mtext,Mtime)
                       VALUES
                       ( 0001, 1, 2,"我是练习时长两年半的个人练习生菜徐坤","2019-6-8");
INSERT INTO Board ( BDid,BDruid,BDsuid ,BDtext,BDtime )
                       VALUES
                       ( 0001, 1, 2,"你就是练习时长两年半的个人练习生菜徐坤","2019-6-8");