CREATE TABLE Sys_User
(
  Id         varchar(32) not null COMMENT "自增Id",
  UserName   varchar(30) not null COMMENT "账号",
  Password   varchar(32) not null COMMENT "密码",
  RealName   varchar(60) not null COMMENT "真实姓名",
  DepId      int         null COMMENT "单位编号",
  RoleId     int         not null COMMENT "角色ID",
  UserSex    int         null COMMENT "性别(1:男0:女)",
  Email      varchar(30) null COMMENT "电子邮箱",
  Mobile     varchar(11) null COMMENT "手机号码",
  Phone      varchar(20) null COMMENT "办公电话",
  BirthDate  Date        null COMMENT "出生日期",
  CreateUser varchar(30) null COMMENT "账号创建者",
  CreateTime DateTime    null COMMENT "创建时间",
  UpdateUser varchar(30) null COMMENT "最后修改用户者",
  UpdateTime DateTime    null COMMENT "最后修改用户时间",
  UserType   int         null COMMENT "用户类型(0:主管厅长1:主管处长2:申请员3:省级管理员4:市县级管理员9:超管)",
  OpenId     varchar(50) null COMMENT "微信唯一标识",
  primary key (Id)
)