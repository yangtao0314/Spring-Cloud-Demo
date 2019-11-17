/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : pinpinduo

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2019-03-21 00:15:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pinpinduo_user
-- ----------------------------
DROP TABLE IF EXISTS `pinpinduo_user`;
CREATE TABLE `pinpinduo_user` (
  `id` varchar(32) NOT NULL COMMENT "主键ID",
  `loginname` varchar(18) NOT NULL COMMENT "帐号",
  `password` varchar(255) NOT NULL COMMENT "密码",
  `phone` int(11) DEFAULT NULL COMMENT "手机号",
  `email` varchar(255) DEFAULT NULL COMMENT "邮箱",
  `add_time` datetime NOT NULL COMMENT "注册时间",
  `edit_time` datetime NOT NULL COMMENT "修改时间",
  `online_time` datetime DEFAULT NULL COMMENT "上线时间",
  `activation` bit DEFAULT NULL COMMENT "是否激活",
  `activation_time` datetime DEFAULT NULL COMMENT"激活时间",
  `is_delete` bit(1) DEFAULT NULL COMMENT "是否删除",
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pinpinduo_user
-- ----------------------------
