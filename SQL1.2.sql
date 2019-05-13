CREATE DATABASE liff;
USE liff;
CREATE TABLE Users (
Userid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 用户编号，主键，自动增长
Upassword VARCHAR ( 20 ) NOT NULL,-- 用户密码
Uquestion1 VARCHAR ( 20 ) NOT NULL,-- 用户密保问题1
UQuestion2 VARCHAR ( 20 ),-- 用户密保问题2
UAnswer1 VARCHAR ( 20 ),-- 密码查询答案1
UAnswer2 VARCHAR ( 20 ) -- 密码查询答案2

);
CREATE TABLE BlogInfo (
	Bid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 动态编号id,主键
	Buid BIGINT NOT NULL,
	FOREIGN KEY ( Buid ) REFERENCES Users ( Userid ),-- 动态发布者id，外键
	Btext VARCHAR ( 200 ) NOT NULL,-- 动态文本
	Bdate datetime NOT NULL,-- 动态发布时间
	Bimage VARCHAR ( 50 ),-- 动态发布照片
	Btitle VARCHAR ( 20 ) -- 动态标题
	
);
CREATE TABLE Comments (
	Cid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 评论id，主键
	Cfid BIGINT NOT NULL,
	Cuid BIGINT NOT NULL,
	FOREIGN KEY ( Cfid ) REFERENCES BlogInfo ( Bid ),-- 评论归属的动态的id，外键
	FOREIGN KEY ( Cuid ) REFERENCES Users ( Userid ),-- 评论者id，外键
	Ctext nvarchar ( 100 ) NOT NULL,-- 评论内容
	Ctime datetime NOT NULL -- 评论创建时间
	
);
CREATE TABLE Thumbs_up (
	Tid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 点赞id，主键
	Thbid BIGINT NOT NULL,
	Tuid BIGINT NOT NULL,
	FOREIGN KEY ( Thbid ) REFERENCES BlogInfo ( Bid ),-- 点赞所属动态的编号，外键
	FOREIGN KEY ( Tuid ) REFERENCES Users ( Userid ),-- 点赞人id，外键
	Tdate datetime NOT NULL -- 点赞创建时间
	
);
CREATE TABLE Follow (
	Fid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 关注id，主键
	Fhuid BIGINT NOT NULL,
	Fuid BIGINT NOT NULL,
	FOREIGN KEY ( Fhuid ) REFERENCES Users ( Userid ),-- 被关注者id，外键
	FOREIGN KEY ( Fuid ) REFERENCES Users ( Userid ),-- 关注者id，外键
	Ftime datetime NOT NULL -- 关注时间
	
);
CREATE TABLE Collect (
	Cid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 收藏信息id，主键
	Cbid BIGINT NOT NULL,
	Cuid BIGINT NOT NULL,
	FOREIGN KEY ( Cbid ) REFERENCES BlogInfo ( Bid ),-- 被收藏动态id，外键
	FOREIGN KEY ( Cuid ) REFERENCES Users ( Userid ),-- 收藏者id，外键
	Ctime datetime NOT NULL -- 收藏时间
	
);
CREATE TABLE UserInfo (
	Uid BIGINT NOT NULL,
	FOREIGN KEY ( Uid ) REFERENCES Users ( Userid ),-- 注册用户账号Users(uname)外键
	Ugender VARCHAR ( 4 ),-- 男	性别
	Ucontact VARCHAR ( 20 ),-- 联系电话
	Uname VARCHAR ( 20 ),-- 真实姓名
	Uaddress VARCHAR ( 200 ),-- 地址
	Uemail VARCHAR ( 100 ),-- 邮箱
	UidentityNumber CHAR ( 18 ),-- 证件号码
	Uimage VARCHAR ( 50 ),-- 头像
	Uhobby VARCHAR ( 50 ) -- 爱好
	
);
CREATE TABLE School (
	Suid BIGINT NOT NULL,
	FOREIGN KEY ( Suid ) REFERENCES Users ( Userid ),-- 用户User,外键
	Spschool VARCHAR ( 50 ),-- 小学
	Smschool VARCHAR ( 50 ),-- 初中
	Shschool VARCHAR ( 50 ),-- 高中
	Suschool VARCHAR ( 50 ),-- 大学
	Spgrade INT,-- 小学年级(入学年)
	Smgrade INT,-- 初中年级(入学年)
	Shgrade INT,-- 高中年级(入学年)
	Sugrade INT-- 大学年级(入学年)
	
);
CREATE TABLE Message (
	Mid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 私信id
	Mruid BIGINT NOT NULL,
	Msuid BIGINT NOT NULL,
	FOREIGN KEY ( Mruid ) REFERENCES Users ( Userid ),-- 接受私信id，外键
	FOREIGN KEY ( Msuid ) REFERENCES Users ( Userid ),-- 发送私信id，外键
	Mtext VARCHAR ( 50 ) NOT NULL,-- 私信text
	Mtime datetime NOT NULL -- 私信发送时间
	
);
CREATE TABLE Board (
	BDid BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,-- 留言id
	BDruid BIGINT NOT NULL,
	BDsuid BIGINT NOT NULL,
	FOREIGN KEY ( BDruid ) REFERENCES Users ( Userid ),-- 接受留言id，外键
	FOREIGN KEY ( BDsuid ) REFERENCES Users ( Userid ),-- 发送留言id，外键
	BDtext VARCHAR ( 50 ) NOT NULL,-- 留言text
	BDtime datetime NOT NULL -- 留言发送时间

);