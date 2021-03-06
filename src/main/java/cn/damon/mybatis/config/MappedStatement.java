package cn.damon.mybatis.config;

/**
 * @ClassName MappedStatement
 * @Description
 * @Author Damon
 * @Date 2019/9/15 23:04
 * @Email zdmsjyx@163.com
 * @Version 1.0
 */
public class MappedStatement {
    private String nameSpace;
    private String sourceId;
    private String resultType;
    private String sql;

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
