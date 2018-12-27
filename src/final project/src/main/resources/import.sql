INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (1, '公司介绍', '公司介绍公司介绍');
INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (2, '公司新闻', '公司新闻公司新闻');
INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (3, '产品介绍', '产品介绍产品介绍');
INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (4, '技术服务', '技术服务技术服务');
INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (5, '商业伙伴', '商业伙伴商业伙伴');
INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (6, '交流招聘', '交流招聘交流招聘');
INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (7, '合作频道', '合作频道合作频道');
INSERT INTO javaweb.lmenu (id, lname, ldescription) VALUES (8, '联系我们', '联系我们联系我们');

INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (1, '上海医疗企业改革', '上海医疗企业改革内容上海医疗企业改革内容', 2, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (2, '国家出台医疗器械使用规范', '国家出台医疗器械使用规范内容国家出台医疗器械使用规范内容', 2, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (3, '外贸企业越来越多进入国内市场', '外贸企业越来越多进入国内市场内容外贸企业越来越多进入国内市场内容', 2, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (4, '碳水化合物饮食对身体的危害', '碳水化合物饮食对身体的危害内容碳水化合物饮食对身体的危害内容', 2, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (5, '世界卫生组织新标准', '世界卫生组织新标准内容世界卫生组织新标准内容', 2, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (6, '如何科学饮食', '如何科学饮食内容如何科学饮食内容', 4, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (7, '学生与医疗体制', '学生与医疗体制内容学生与医疗体制内容', 4, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (8, '医疗就业前景分析', '医疗就业前景分析内容医疗就业前景分析内容', 4, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (9, '注射体液对身体的作用', '注射体液对身体的作用内容注射体液对身体的作用内容', 4, null);
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (10, '产品1', '产品1内容产品1内容', 3, 'product/index_01.png');
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (11, '产品2', '产品2内容产品2内容', 3, 'product/index_01.png');
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (12, '产品3', '产品3内容产品3内容', 3, 'product/index_01.png');
INSERT INTO javaweb.news (id, ntitle, ncontent, father, nurl) VALUES (13, '产品4', '产品4内容产品4内容', 3, 'product/index_01.png');

INSERT INTO javaweb.users (id, username, pwd) VALUES (1, 'Zhangsan', '123456');
INSERT INTO javaweb.users (id, username, pwd) VALUES (2, 'Lisi', '123456');
INSERT INTO javaweb.users (id, username, pwd) VALUES (3, 'Wangwu', '123456');