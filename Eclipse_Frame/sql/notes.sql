/*
Navicat MySQL Data Transfer

Source Server         : Linux_MySQL
Source Server Version : 50637
Source Host           : 192.168.56.103:3306
Source Database       : KEEDINGBLOG

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2018-02-08 09:47:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for notes
-- ----------------------------
DROP TABLE IF EXISTS `notes`;
CREATE TABLE `notes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mark` varchar(18) DEFAULT NULL,
  `headline` varchar(18) NOT NULL,
  `content` varchar(2184) DEFAULT NULL,
  `initTime` date DEFAULT NULL,
  `updateTime` date DEFAULT NULL,
  `category` int(11) DEFAULT NULL,
  `power` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notes
-- ----------------------------
INSERT INTO `notes` VALUES ('1', 'mark', 'Linux新个人笔记', '\r\n新个人笔记\r\n    文件操作\r\n    touch、mkdir\r\n    rm -rf\r\n    mv（当移动多个文件时：mv 1文件 2文件 -t 目标目录）\r\n    vi、vim、cat、head、tail、more（vim比vi增加了多级撤销的功能）\r\n    \r\n        :w           //保存文件 \r\n        :q          //退出编辑器，如果文件已修改请使用下面的命令 \r\n        :q!         //退出编辑器，且不保存 \r\n        :wq         //退出编辑器，且保存文件 \r\n    \r\n    系统操作\r\n    cd、cd -、\r\n    ls -a显示隐藏        \r\n    df -hl\r\n    ll、ls    \r\n    history\r\n    systemctl stop firewalld.service\r\n    clear\r\n    hostname xxx\r\n    \r\n    我目前不熟悉的命令\r\n        grep 想要查询的字段 文件路径\r\n        cp、scp\r\n        pwd\r\n        文件生效：\r\n            source\r\n        快捷凡是\r\n            ln -s 文件名 快捷文件名\r\n        查看\r\n            ps aux|grep 进程名\r\n            rpm -qa|grep 已安装的rpm程序\r\n        下载命令：\r\n            yum （Yellow dog Updater, Modified）\r\n            wget（命令用来从指定的URL下载文件、类似于迅雷，是一种下载工具）\r\n        杀掉命令：\r\n            kill\r\n        解压：\r\n            tar -zxvf\r\n        vim的命令\r\n            VIM的翻页等\r\n            整页翻页 ctrl-f ctrl-b\r\n                f就是forword b就是backward\r\n            翻半页\r\n                ctrl-d ctlr-u\r\n                d=down u=up\r\n            滚一行\r\n                ctrl-e ctrl-y\r\n                zz 让光标所杂的行居屏幕中央\r\n                zt 让光标所杂的行居屏幕最上一行 t=top\r\n                zb 让光标所杂的行居屏幕最下一行 b=bottom\r\n            vi、vim\r\n                跳转到文档开头:gg\r\n                跳转到文档末尾：G\r\n                用于显示指定文件末尾内容，不指定文件时，作为输入信息进行处理。常用查看日志文件。\r\n            行首^（即Shift+6）   行尾Shift+0\r\n                与快捷键\"^\"和0不同，快捷键\"$\"前可以加上数字表示移动的行数。例如使用\"1$\"表示当前行的行尾，\"2$\"表示当前行的下一行的行尾。\r\n            模糊查询字符串\r\n                用/和？的区别：\r\n                /后跟查找的字符串。vim会显示文本中第一个出现的字符串。\r\n                ?后跟查找的字符串。vim会显示文本中最后一个出现的字符串。\r\n                然后输入Shift + *  ，即可快速选中该单词，并且可以通过 n  或  N 进行上一个或下一个的匹配。\r\n        head、more\r\n            按Space键：显示文本的下一屏内容。\r\n            按Enier键：只显示文本的下一行内容。\r\n            按斜线符|：接着输入一个模式，可以在文本中寻找下一个相匹配的模式。\r\n            按H键：显示帮助屏，该屏上有相关的帮助信息。\r\n            按B键：显示上一屏内容。\r\n            按Q键：退出rnore命令\r\n\r\n    其他\r\n    mysql服务停止、开启指令：service mysqld stop        service mysqld restart\r\n\r\n需要学习的Linux的命令\r\ncurl命令\r\ngrep命令\r\n来自: http://man.linuxde.net/curl\r\n                \r\n', null, null, null, null);
INSERT INTO `notes` VALUES ('2', 'mark', 'ss', '1', null, null, null, null);
INSERT INTO `notes` VALUES ('3', 'mark', 'Linux新个人笔记', '1', null, null, null, null);
INSERT INTO `notes` VALUES ('4', 'mark', 'Linux新个人笔记', '1', null, null, null, null);
INSERT INTO `notes` VALUES ('5', 'mark', 'Linux新个人笔记', '1', null, null, null, null);
INSERT INTO `notes` VALUES ('8', 'mark', 'Linux新个人笔记', '1', null, null, null, null);
