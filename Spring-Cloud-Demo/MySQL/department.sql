create table DepartMent
(
  Id              varchar(32)  not null COMMENT "生成uuid",
  DepName         varchar(100) not null COMMENT "单位名称",
  DepAddress      varchar(80)  null COMMENT "单位地址",
  DepType         int          not null COMMENT "单位性质(1:行政2:参公3:社团4:国企5:事业6:私企999:其它)",
  DepLevel        int          not null COMMENT "单位级别(0:省级1:厅级2:副厅级3:处级4:副处级5:科级6:副科级7:副省级)",
  NumberAll       int          null COMMENT "人员编制数",
  NumberTrue      int          null COMMENT "人员实有数",
  NumberLeader    int          null COMMENT "领导值数",
  NumberLeaderChu int          null COMMENT "处级领导干部值数",
  CarNumberAll    int          null COMMENT "车辆编制数",
  CarNumberTrue   int          null COMMENT "车辆实有数",
  ImgOrg          varchar(100) null COMMENT "组织机构代码证",
  ImgCheck        varchar(100) null COMMENT "车辆编制审批表",
  ImgThree        varchar(100) null COMMENT "三定方案",
  OrgId           varchar(32)  null COMMENT "组织Id",
  OrgParent       varchar(32)  null COMMENT "组织父级Id",
  OrgType         varchar(2)   null COMMENT "组织类型(P:平台)",
  OrderCode       int          null COMMENT "索引",
  primary key (Id)
)