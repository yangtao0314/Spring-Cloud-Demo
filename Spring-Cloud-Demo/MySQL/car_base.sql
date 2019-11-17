create table Car_Base#车辆基本信息表
(
  Id           VARCHAR(32) not null COMMENT "自增Id",
  CarPlateType varchar(2)  not null COMMENT "车牌类型",
  CarPlateNum  varchar(9)  not null COMMENT "车牌号",
  DepId        VARCHAR(32) not null COMMENT "所属单位",
  CarBrand     int         not null COMMENT "汽车品牌",
  CarType      int         not null COMMENT "车辆类型",
  CarColor     int         not null COMMENT "车辆颜色",
  PersonCount  int         not null COMMENT "核定人数",
  DisPlaceMent int         not null COMMENT "排量(ml)",
  FactoryTime  DateTime    not null COMMENT "出厂时间",
  Organization int         not null COMMENT "编制属性",
  Fuel         int         not null COMMENT "燃料种类",
  Power        int         not null COMMENT "功率",
  CarStatus    int         not null COMMENT "车辆状态(0:待提交1待审核2已审核3已驳回)",
  CarCurState  int         not null COMMENT "车辆现状(0:在库1:派出2:保养\维修3:封存,4:被选中)",
  primary key (Id)
)
