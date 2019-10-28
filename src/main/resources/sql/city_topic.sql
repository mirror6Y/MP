/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80003
 Source Host           : localhost:3306
 Source Schema         : city_topic

 Target Server Type    : MySQL
 Target Server Version : 80003
 File Encoding         : 65001

 Date: 28/10/2019 20:34:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_graduate
-- ----------------------------
DROP TABLE IF EXISTS `t_graduate`;
CREATE TABLE `t_graduate`  (
  `C_ID` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '学号',
  `C_PASSWORD` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `C_NAME` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `N_GENDER` int(11) NULL DEFAULT NULL COMMENT '性别',
  `N_COLLEGE` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '院系',
  `N_PROFESSION` int(11) NULL DEFAULT NULL COMMENT '专业',
  `C_GRADE` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '年级',
  `C_TEL` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系方式',
  `N_PEOPLE` int(11) NULL DEFAULT NULL COMMENT '民族',
  `N_POLITICALSTATUS` int(11) NULL DEFAULT NULL COMMENT '政治面貌',
  `C_IDCARD` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '身份证号码',
  `N_EDUCATION` int(11) NULL DEFAULT NULL COMMENT '学历',
  `N_DEGREE` int(11) NULL DEFAULT NULL COMMENT '学位类型',
  `C_ADDRESS` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '家庭地址',
  `D_GRADUATETIME` date NULL DEFAULT NULL COMMENT '毕业时间',
  PRIMARY KEY (`C_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_teacher
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher`  (
  `C_ID` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师工号',
  `C_PASSWORD` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `C_NAME` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `N_GENDER` int(11) NULL DEFAULT NULL COMMENT '性别',
  `N_COLLEGE` int(11) NULL DEFAULT NULL COMMENT '院系',
  `C_OFFICE` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '办公室',
  `C_TEL` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系方式',
  `N_PERMISSION` int(11) NULL DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`C_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_teacher
-- ----------------------------
INSERT INTO `t_teacher` VALUES ('111', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_teacher` VALUES ('112', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_teacher` VALUES ('113', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_teacher` VALUES ('114', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_teacher` VALUES ('115', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_teacher` VALUES ('123', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_teacher` VALUES ('456', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
