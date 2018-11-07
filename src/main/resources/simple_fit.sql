/*
 Navicat Premium Data Transfer

 Source Server         : DB
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : simple_fit

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 07/11/2018 15:50:35
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for info_shop
-- ----------------------------
DROP TABLE IF EXISTS `info_shop`;
CREATE TABLE `info_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `owner_id` int(11) DEFAULT NULL COMMENT '这里存的是商家的 id',
  `name` varchar(50) DEFAULT NULL COMMENT '店名',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for relation_lesson_credential
-- ----------------------------
DROP TABLE IF EXISTS `relation_lesson_credential`;
CREATE TABLE `relation_lesson_credential` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lesson_id` int(11) DEFAULT NULL,
  `credentail_id` int(11) DEFAULT NULL,
  `create_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `update_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for relation_trainer_lesson
-- ----------------------------
DROP TABLE IF EXISTS `relation_trainer_lesson`;
CREATE TABLE `relation_trainer_lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '课程名',
  `trainer_credential_id` int(11) DEFAULT NULL COMMENT '不是 uid 请注意！',
  `lesson_credentail_id` int(11) DEFAULT NULL,
  `shop_id` int(11) DEFAULT NULL COMMENT '代表在哪儿上课',
  `capacity` int(11) DEFAULT NULL COMMENT '课程容量',
  `frequency` int(11) DEFAULT NULL COMMENT '上课次数',
  `time` varchar(50) DEFAULT NULL COMMENT '代表上课时间',
  `status` int(11) DEFAULT NULL COMMENT '0代表申请中，1代表申请成功，2代表申请失败，3代表过期',
  `confirm_trainer` int(11) DEFAULT NULL,
  `confirm_seller` int(11) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  `validation` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
