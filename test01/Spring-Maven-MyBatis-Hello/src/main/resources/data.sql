-- 테이블
CREATE TABLE `test`(  
      `id` VARCHAR(10) NOT NULL,
      `pw` VARCHAR(10),
      `name` VARCHAR(10),
    PRIMARY KEY (`id`)
);
 
 
-- 데이터
INSERT INTO TEST(id, pw, NAME) VALUES ( 'id1', 'pw1', 'name1');
INSERT INTO TEST(id, pw, NAME) VALUES ( 'id2', 'pw2', 'name2');
INSERT INTO TEST(id, pw, NAME) VALUES ( 'id3', 'pw3', 'name3');
INSERT INTO TEST(id, pw, NAME) VALUES ( 'id4', 'pw4', '한글4');

