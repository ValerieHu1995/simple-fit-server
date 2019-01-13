/*
 Navicat Premium Data Transfer

 Source Server         : MySQLDB
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : simple_fit

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 13/01/2019 16:22:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for info_credential
-- ----------------------------
DROP TABLE IF EXISTS `info_credential`;
CREATE TABLE `info_credential` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_credential
-- ----------------------------
BEGIN;
INSERT INTO `info_credential` VALUES (1, '低级瑜伽', NULL, NULL, NULL);
INSERT INTO `info_credential` VALUES (2, '高级瑜伽', NULL, NULL, NULL);
INSERT INTO `info_credential` VALUES (3, '低级跑步', NULL, NULL, NULL);
INSERT INTO `info_credential` VALUES (4, '高级跑步', NULL, NULL, NULL);
INSERT INTO `info_credential` VALUES (5, '低级游泳', NULL, NULL, NULL);
INSERT INTO `info_credential` VALUES (6, '高级游泳', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for info_detail_buyer
-- ----------------------------
DROP TABLE IF EXISTS `info_detail_buyer`;
CREATE TABLE `info_detail_buyer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `obtain_time` varchar(50) DEFAULT NULL COMMENT '开卡时间',
  `expire_time` varchar(50) DEFAULT NULL COMMENT '结束时间',
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_detail_buyer
-- ----------------------------
BEGIN;
INSERT INTO `info_detail_buyer` VALUES (1, 1, '20190101', '20191010', NULL, NULL, NULL);
INSERT INTO `info_detail_buyer` VALUES (2, 2, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `info_detail_buyer` VALUES (3, 9, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `info_detail_buyer` VALUES (4, 12, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for info_detail_seller
-- ----------------------------
DROP TABLE IF EXISTS `info_detail_seller`;
CREATE TABLE `info_detail_seller` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_detail_seller
-- ----------------------------
BEGIN;
INSERT INTO `info_detail_seller` VALUES (1, 3, '陈洲', NULL, NULL, NULL);
INSERT INTO `info_detail_seller` VALUES (2, 4, '孙露阳', NULL, NULL, NULL);
INSERT INTO `info_detail_seller` VALUES (3, 10, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for info_detail_trainer
-- ----------------------------
DROP TABLE IF EXISTS `info_detail_trainer`;
CREATE TABLE `info_detail_trainer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_detail_trainer
-- ----------------------------
BEGIN;
INSERT INTO `info_detail_trainer` VALUES (1, 7, '陈泽平', NULL, NULL, NULL);
INSERT INTO `info_detail_trainer` VALUES (2, 8, '某教练', NULL, NULL, NULL);
INSERT INTO `info_detail_trainer` VALUES (3, 11, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for info_lesson
-- ----------------------------
DROP TABLE IF EXISTS `info_lesson`;
CREATE TABLE `info_lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_lesson
-- ----------------------------
BEGIN;
INSERT INTO `info_lesson` VALUES (1, '瑜伽', NULL, NULL, NULL);
INSERT INTO `info_lesson` VALUES (2, '跑步', NULL, NULL, NULL);
INSERT INTO `info_lesson` VALUES (3, '游泳', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for info_shop
-- ----------------------------
DROP TABLE IF EXISTS `info_shop`;
CREATE TABLE `info_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `owner_id` int(11) DEFAULT NULL COMMENT '这里存的是商家的 id',
  `name` varchar(50) DEFAULT NULL COMMENT '店名',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `time` varchar(50) DEFAULT NULL COMMENT '团课时间(弃用)',
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `capacity` int(11) DEFAULT NULL COMMENT '最大同时上课人数',
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_shop
-- ----------------------------
BEGIN;
INSERT INTO `info_shop` VALUES (1, 1, '七侠镇店', '七侠镇', NULL, NULL, NULL, 2, NULL);
INSERT INTO `info_shop` VALUES (2, 1, '同福客栈店', '同福客栈', NULL, NULL, NULL, 2, NULL);
INSERT INTO `info_shop` VALUES (3, 2, '十八里铺店', '十八里铺', NULL, NULL, NULL, 2, NULL);
INSERT INTO `info_shop` VALUES (4, 2, '西凉河店', '西凉河', NULL, NULL, NULL, 2, NULL);
COMMIT;

-- ----------------------------
-- Table structure for info_user
-- ----------------------------
DROP TABLE IF EXISTS `info_user`;
CREATE TABLE `info_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `gender` int(1) DEFAULT NULL,
  `birthday` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `verify_phone` int(1) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `verify_email` int(1) DEFAULT NULL,
  `alipay` varchar(50) DEFAULT NULL,
  `wechatpay` varchar(50) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  `type` int(5) DEFAULT NULL COMMENT '0 代表用户 1代表商家 2代表教练 3代表管理',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_user
-- ----------------------------
BEGIN;
INSERT INTO `info_user` VALUES (1, 'koon1', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `info_user` VALUES (2, 'koon2', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `info_user` VALUES (3, 'koon3', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `info_user` VALUES (4, 'koon4', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `info_user` VALUES (5, 'koon5', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `info_user` VALUES (6, 'koon6', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `info_user` VALUES (7, 'koon7', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `info_user` VALUES (8, 'koon8', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 3);
INSERT INTO `info_user` VALUES (9, 'koon9', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `info_user` VALUES (10, 'koon10', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `info_user` VALUES (11, 'koon11', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `info_user` VALUES (12, 'koon12', 'czp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
COMMIT;

-- ----------------------------
-- Table structure for info_wallet
-- ----------------------------
DROP TABLE IF EXISTS `info_wallet`;
CREATE TABLE `info_wallet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `balance` int(100) DEFAULT NULL COMMENT '100 = 1 元',
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_wallet
-- ----------------------------
BEGIN;
INSERT INTO `info_wallet` VALUES (1, 1, 10000, '20180902', NULL, NULL);
INSERT INTO `info_wallet` VALUES (2, 2, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (3, 3, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (4, 4, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (5, 5, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (6, 6, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (7, 7, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (8, 8, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (9, 9, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (10, 10, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (11, 11, 10000, NULL, NULL, NULL);
INSERT INTO `info_wallet` VALUES (12, 12, 0, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for log_entry
-- ----------------------------
DROP TABLE IF EXISTS `log_entry`;
CREATE TABLE `log_entry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `shop_id` int(11) DEFAULT NULL,
  `entry_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_login
-- ----------------------------
DROP TABLE IF EXISTS `log_login`;
CREATE TABLE `log_login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `login_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for relation_buyer_lesson
-- ----------------------------
DROP TABLE IF EXISTS `relation_buyer_lesson`;
CREATE TABLE `relation_buyer_lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `buyer_id` int(11) DEFAULT NULL,
  `trainer_lesson_id` int(11) DEFAULT NULL,
  `confirm_buyer` int(11) DEFAULT NULL,
  `confirm_trainer` int(11) DEFAULT NULL,
  `create_time` varchar(11) DEFAULT NULL,
  `update_time` varchar(11) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation_buyer_lesson
-- ----------------------------
BEGIN;
INSERT INTO `relation_buyer_lesson` VALUES (1, 1, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_buyer_lesson` VALUES (2, 2, 2, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_buyer_lesson` VALUES (3, 3, 1, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for relation_buyer_trainer_lesson
-- ----------------------------
DROP TABLE IF EXISTS `relation_buyer_trainer_lesson`;
CREATE TABLE `relation_buyer_trainer_lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `buyer_id` int(11) DEFAULT NULL,
  `trainer_lesson_id` int(11) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL COMMENT '每次上课的上课时间',
  `confirm_trainer` int(11) DEFAULT NULL COMMENT '教练确认该节课结束',
  `confirm_buyer` int(11) DEFAULT NULL COMMENT '学员确认该节课结束',
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation_buyer_trainer_lesson
-- ----------------------------
BEGIN;
INSERT INTO `relation_buyer_trainer_lesson` VALUES (1, 1, 1, '20181127001', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_buyer_trainer_lesson` VALUES (2, 1, 1, '20181126010', NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for relation_lesson_credential
-- ----------------------------
DROP TABLE IF EXISTS `relation_lesson_credential`;
CREATE TABLE `relation_lesson_credential` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lesson_id` int(11) DEFAULT NULL,
  `credential_id` int(11) DEFAULT NULL,
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation_lesson_credential
-- ----------------------------
BEGIN;
INSERT INTO `relation_lesson_credential` VALUES (1, 1, 1, NULL, NULL, NULL);
INSERT INTO `relation_lesson_credential` VALUES (2, 1, 2, NULL, NULL, NULL);
INSERT INTO `relation_lesson_credential` VALUES (3, 2, 3, NULL, NULL, NULL);
INSERT INTO `relation_lesson_credential` VALUES (4, 2, 4, NULL, NULL, NULL);
INSERT INTO `relation_lesson_credential` VALUES (5, 3, 5, NULL, NULL, NULL);
INSERT INTO `relation_lesson_credential` VALUES (6, 3, 6, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for relation_trainer_credential
-- ----------------------------
DROP TABLE IF EXISTS `relation_trainer_credential`;
CREATE TABLE `relation_trainer_credential` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `trainer_id` int(11) DEFAULT NULL,
  `credentail_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '0代表申请中，1代表申请成功，2代表申请失败，3代表过期',
  `obtain_time` varchar(50) DEFAULT NULL,
  `expire_time` varchar(50) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation_trainer_credential
-- ----------------------------
BEGIN;
INSERT INTO `relation_trainer_credential` VALUES (1, 1, 1, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_credential` VALUES (2, 1, 3, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_credential` VALUES (3, 2, 2, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_credential` VALUES (4, 2, 4, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_credential` VALUES (5, 1, 5, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_credential` VALUES (6, 2, 6, 1, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for relation_trainer_lesson
-- ----------------------------
DROP TABLE IF EXISTS `relation_trainer_lesson`;
CREATE TABLE `relation_trainer_lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '课程名',
  `trainer_id` int(11) DEFAULT NULL COMMENT '不是 uid 请注意！',
  `lesson_id` int(11) DEFAULT NULL,
  `shop_id` int(11) DEFAULT NULL COMMENT '代表在哪儿上课',
  `capacity` int(11) DEFAULT NULL COMMENT '课程容量',
  `frequency` int(11) DEFAULT NULL COMMENT '上课次数',
  `time` varchar(50) DEFAULT NULL COMMENT '代表上课时间 上午、下午、晚上 只在周末开',
  `status` int(11) DEFAULT NULL COMMENT '0代表申请中，1代表申请成功，2代表申请失败，3代表过期',
  `confirm_trainer` int(11) DEFAULT NULL,
  `confirm_seller` int(11) DEFAULT NULL,
  `type` int(5) DEFAULT NULL COMMENT '0代表私课 1代表团课',
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation_trainer_lesson
-- ----------------------------
BEGIN;
INSERT INTO `relation_trainer_lesson` VALUES (1, '陈泽平的低级瑜伽课', 1, 1, 1, 2, 3, NULL, 1, NULL, NULL, 0, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (2, '某教练的高级瑜伽课', 2, 1, 2, 2, 3, NULL, 1, NULL, NULL, 0, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (3, '陈泽平的低级跑步课', 1, 2, 3, 2, 3, NULL, 1, NULL, NULL, 0, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (4, '某教练的高级跑步课', 2, 2, 4, 2, 3, NULL, 1, NULL, NULL, 0, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (5, '测试课程', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (7, '测试课程', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (8, '测试课程', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (9, '测试课程', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (10, '测试课程', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (11, '测试课程', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (12, '测试课程', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `relation_trainer_lesson` VALUES (13, '这是一门不知道能不能开的游泳课', 1, 3, 1, 2, 3, '000000000000000000001', 1, NULL, NULL, 0, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for relation_user_wallet
-- ----------------------------
DROP TABLE IF EXISTS `relation_user_wallet`;
CREATE TABLE `relation_user_wallet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `buyer_id` int(11) DEFAULT NULL COMMENT '付钱方',
  `wallet_id` int(11) DEFAULT NULL COMMENT '收钱方',
  `money` int(100) DEFAULT NULL COMMENT '100 = 1 元',
  `create_time` int(11) DEFAULT NULL,
  `update_time` int(11) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  `spending` int(1) DEFAULT NULL,
  `trainer_lesson_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of relation_user_wallet
-- ----------------------------
BEGIN;
INSERT INTO `relation_user_wallet` VALUES (1, 1, 3, 100, 20180903, NULL, NULL, 1, 1);
INSERT INTO `relation_user_wallet` VALUES (2, 1, 3, 1000, 20180903, NULL, NULL, 1, 1);
INSERT INTO `relation_user_wallet` VALUES (3, 1, 2, 1000, 20180903, NULL, NULL, 0, 0);
INSERT INTO `relation_user_wallet` VALUES (4, 1, 3, 1000, 20180903, NULL, NULL, 0, 0);
INSERT INTO `relation_user_wallet` VALUES (5, 1, 3, 100, 20190101, NULL, NULL, 0, 0);
INSERT INTO `relation_user_wallet` VALUES (6, 1, 3, 100, 20190113, NULL, NULL, 0, 0);
INSERT INTO `relation_user_wallet` VALUES (7, 2, 3, 1000, 20190113, NULL, NULL, 1, 1);
INSERT INTO `relation_user_wallet` VALUES (8, 1, 1, 1000, 20190114, NULL, NULL, 1, 2);
INSERT INTO `relation_user_wallet` VALUES (9, 2, 2, 1000, 20190113, NULL, NULL, 1, 4);
COMMIT;

-- ----------------------------
-- Triggers structure for table info_user
-- ----------------------------
DROP TRIGGER IF EXISTS `register`;
delimiter ;;
CREATE TRIGGER `register` AFTER INSERT ON `info_user` FOR EACH ROW begin 
	if new.type = 0 then
		insert into info_detail_buyer(user_id) values (new.id);
	end if;
	if new.type = 1 then
		insert into info_detail_seller(user_id) values (new.id);
	end if;
	if new.type = 2 then
		insert into info_detail_trainer(user_id) values (new.id);
	end if;
	insert into info_wallet(user_id, balance) values(new.id, 0);
end
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table relation_user_wallet
-- ----------------------------
DROP TRIGGER IF EXISTS `changeBalance`;
delimiter ;;
CREATE TRIGGER `changeBalance` AFTER INSERT ON `relation_user_wallet` FOR EACH ROW begin
	if new.wallet_id = 0 then
		update info_wallet 
		set balance = balance - new.money
		where buyer_id = user_id;
	end if;
end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
