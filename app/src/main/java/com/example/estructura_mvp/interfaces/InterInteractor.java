package com.example.estructura_mvp.interfaces;

import com.example.estructura_mvp.listeners.OnLogin;

public interface InterInteractor {
void validate(String user, String pass, OnLogin listener);

}
