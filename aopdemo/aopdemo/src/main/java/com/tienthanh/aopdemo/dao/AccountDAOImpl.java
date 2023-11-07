package com.tienthanh.aopdemo.dao;

public class AccountDAOImpl implements AccountDAO {
    @Override
    public void addAccount() {
        System.out.println(getClass() + "Doing my db work : Adding account");

    }
}
