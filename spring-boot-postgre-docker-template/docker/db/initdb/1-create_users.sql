/**
 * 利用者テーブル
 */
CREATE TABLE users (
  id SERIAL,
  name VARCHAR(255) NOT NULL, /** ユーザー名 */
  PRIMARY KEY (id)
);