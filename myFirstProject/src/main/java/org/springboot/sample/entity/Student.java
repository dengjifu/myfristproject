package org.springboot.sample.entity;

import java.io.Serializable;

/**
 * 学生实体
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月12日
 */
public class Student implements Serializable{

    private static final long serialVersionUID = 2120869894112984147L;

    private int id;
    private String name;
    private String sumScore;
    private String avgScore;
    private int age;

     public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSumScore() {
        return sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 节省文章长度，get set 方法省略
}
