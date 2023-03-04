package com.driver.services;

import com.driver.model.User;

public interface ConnectionService {
    public User connect(int userId, String countryName) throws Exception;
    public User disconnect(int userId) throws Exception;
}