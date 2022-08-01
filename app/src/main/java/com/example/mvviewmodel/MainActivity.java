package com.example.mvviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.mvviewmodel.databinding.ActivityMainBinding;
import com.example.mvviewmodel.models.Customer;
import com.example.mvviewmodel.viewmodels.Mainviewmodel;

public class MainActivity extends AppCompatActivity
{
    Mainviewmodel mainviewmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding mainXml= DataBindingUtil.setContentView(this,R.layout.activity_main);
//        mainXml.setCname("Hello");
        Customer customer=new Customer("Md Akil");
//        mainXml.setCustomer(customer);

        mainviewmodel= ViewModelProviders.of(this).get(Mainviewmodel.class);
        mainXml.setCustomer(mainviewmodel.getCustomer());
    }
}