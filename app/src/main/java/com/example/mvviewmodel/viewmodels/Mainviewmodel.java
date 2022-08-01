package com.example.mvviewmodel.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.mvviewmodel.models.Customer;

public class Mainviewmodel extends AndroidViewModel
{
    Customer customer;

    public Mainviewmodel(@NonNull Application application) {
        super(application);
        customer=new Customer("Mohd Akil");
    }

    public Customer getCustomer() {
        return this.customer;
    }
}
