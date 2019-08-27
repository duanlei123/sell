/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : sell

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 09/08/2019 18:44:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail`  (
  `detail_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `product_price` decimal(8, 2) NOT NULL COMMENT '商品价格',
  `product_quantity` int(11) NOT NULL COMMENT '商品数量',
  `product_icon` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品图片',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`detail_id`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单详情表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('123456789', '123456', '123456', '皮蛋粥', 1.20, 2, 'http://xxxx.jpg', '2019-08-08 17:20:33', '2019-08-08 17:20:33');
INSERT INTO `order_detail` VALUES ('123456799', '123457', '123457', '皮皮虾', 2.20, 2, 'http://xxxx.jpg', '2019-08-08 17:21:55', '2019-08-08 17:21:55');
INSERT INTO `order_detail` VALUES ('1565261474039115620', '1565261473983372378', '254635', '肉炒饼(大)', 16.00, 1, 'http://xxxxx.jpg', '2019-08-07 11:06:10', '2019-08-07 11:06:10');
INSERT INTO `order_detail` VALUES ('1565261947524826580', '1565261947466812685', '254635', '肉炒饼(大)', 16.00, 1, 'http://xxxxx.jpg', '2019-08-07 11:06:10', '2019-08-08 18:58:36');
INSERT INTO `order_detail` VALUES ('1565261947542904405', '1565261947466812685', '123457', '皮皮虾', 13.00, 2, 'http://xxxxx.jpg', '2019-08-06 18:10:47', '2019-08-08 18:58:32');
INSERT INTO `order_detail` VALUES ('1565329662344205487', '1565329662333519640', '123456', '皮蛋粥', 3.20, 2, 'http://xxxxx.jpg', '2019-08-06 17:04:57', '2019-08-06 17:04:57');
INSERT INTO `order_detail` VALUES ('1565330066401228888', '1565330066356690931', '123457', '皮皮虾', 13.00, 3, 'http://xxxxx.jpg', '2019-08-06 18:10:47', '2019-08-08 20:52:41');
INSERT INTO `order_detail` VALUES ('1565330251447905795', '1565330222747494991', '123456', '皮蛋粥', 3.20, 4, 'http://xxxxx.jpg', '2019-08-06 17:04:57', '2019-08-09 13:47:42');
INSERT INTO `order_detail` VALUES ('1565330692889773810', '1565330692848699457', '123457', '皮皮虾', 13.00, 8, 'http://xxxxx.jpg', '2019-08-06 18:10:47', '2019-08-09 13:54:26');

-- ----------------------------
-- Table structure for order_master
-- ----------------------------
DROP TABLE IF EXISTS `order_master`;
CREATE TABLE `order_master`  (
  `order_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `buyer_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买家名字',
  `buyer_phone` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买家电话',
  `buyer_address` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买家地址',
  `buyer_openid` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买家微信openid',
  `order_amount` decimal(8, 2) NOT NULL COMMENT '订单总金额',
  `order_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '订单状态，默认0新下单',
  `pay_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '支付状态，默认0未支付',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `idx_buyer_openid`(`buyer_openid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_master
-- ----------------------------
INSERT INTO `order_master` VALUES ('123456', '及时雨', '13356986553', '梁山主屋', '001', 2.30, 0, 0, '2019-08-08 17:08:49', '2019-08-08 17:08:49');
INSERT INTO `order_master` VALUES ('123457', '玉麒麟', '13356986554', '梁山左屋', '002', 2.50, 0, 0, '2019-08-08 17:10:11', '2019-08-08 17:10:11');
INSERT INTO `order_master` VALUES ('1565261473983372378', '黑旋风', '13393406705', '梁山小破屋', '003', 16.00, 0, 0, '2019-08-08 18:51:14', '2019-08-08 18:51:14');
INSERT INTO `order_master` VALUES ('1565261947466812685', '鼓上骚', '18888888888', '梁山聚义堂108号', '108', 42.00, 0, 1, '2019-08-08 18:59:07', '2019-08-08 21:02:50');
INSERT INTO `order_master` VALUES ('1565329662333519640', '豹子头', '13565478888', '梁山总教头室', '008', 6.40, 0, 0, '2019-08-09 13:47:42', '2019-08-09 13:47:42');
INSERT INTO `order_master` VALUES ('1565330066356690931', '花和尚', '13565477777', '梁山佛事后院', '009', 39.00, 0, 0, '2019-08-09 13:54:26', '2019-08-09 13:54:26');
INSERT INTO `order_master` VALUES ('1565330222747494991', '霹雳火', '13565477777', '梁山聚义堂65号', '065', 12.80, 0, 0, '2019-08-09 13:59:54', '2019-08-09 13:59:54');
INSERT INTO `order_master` VALUES ('1565330692848699457', '浪里白条', '1356546666', '梁山高级洗浴165号', '165', 104.00, 2, 0, '2019-08-09 14:05:35', '2019-08-09 18:04:53');

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category`  (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类目名称',
  `category_type` int(11) NOT NULL COMMENT '类目编号',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`category_id`) USING BTREE,
  UNIQUE INDEX `uqe_category_type`(`category_type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '类目表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product_category` VALUES (1, '热销榜', 2, '2019-08-06 15:01:48', '2019-08-06 15:49:47');
INSERT INTO `product_category` VALUES (2, '推荐榜', 3, '2019-08-07 11:04:18', '2019-08-07 11:04:18');

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info`  (
  `product_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `product_price` decimal(8, 2) NOT NULL COMMENT '商品价格',
  `product_stock` int(11) NOT NULL COMMENT '库存',
  `product_description` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `product_icon` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '小图',
  `product_status` int(11) NOT NULL COMMENT '状态,0正常 1下架',
  `category_type` int(11) NOT NULL COMMENT '类目编号',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`product_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product_info` VALUES ('123456', '皮蛋粥', 3.20, 94, '很好喝的粥', 'http://xxxxx.jpg', 0, 2, '2019-08-06 17:04:57', '2019-08-09 13:59:54');
INSERT INTO `product_info` VALUES ('123457', '皮皮虾', 13.00, 95, '很好吃的虾', 'http://xxxxx.jpg', 0, 2, '2019-08-06 18:10:47', '2019-08-09 18:04:53');
INSERT INTO `product_info` VALUES ('254635', '肉炒饼(大)', 16.00, 99, '实惠，好吃，必选', 'http://xxxxx.jpg', 0, 3, '2019-08-07 11:06:10', '2019-08-08 20:52:38');

SET FOREIGN_KEY_CHECKS = 1;
