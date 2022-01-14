### 题目：drop,delete与truncate的区别

drop直接删掉表 truncate删除表中数据
一般而言，drop > truncate > delete
TRUNCATE 和DELETE只删除数据，而DROP则删除整个表（结构和数据）。
delete语句为DML（Data Manipulation Language),这个操作会被放到 rollback segment中,事务提交后才生效。
truncate、drop是DDL（Data Define Language),操作立即生效，原数据不放到 rollback segment中，不能回滚

### B+树

树的节点与data域保存记录，key是主键，主索引搜索时。找出key节点取出数值，非叶子节点不存储data 叶子节点包含索引字段

叶子节点：没有子节点的节点

![image](https://camo.githubusercontent.com/d179da3747d2ed1fff74ac1acd2ed629f833a8a5adfe235169f75787a4ab6cd9/687474703a2f2f7777772e3263746f2e636f6d2f75706c6f616466696c652f436f6c6c66696c65732f32303135303431362f323031353034313631303033333733312e706e67)



 
