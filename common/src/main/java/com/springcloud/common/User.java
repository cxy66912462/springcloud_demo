package com.springcloud.common;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-10-26
 * Time: 18:18
 */
public class User {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}
