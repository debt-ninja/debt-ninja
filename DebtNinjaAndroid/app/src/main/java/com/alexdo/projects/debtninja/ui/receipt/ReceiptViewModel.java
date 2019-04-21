package com.alexdo.projects.debtninja.ui.receipt;

import android.arch.lifecycle.ViewModel;

import org.joda.money.Money;

import java.sql.Timestamp;

public class ReceiptViewModel extends ViewModel {
    private String creator;
    private Money total;
    private Money debt;
    private String title;
    private Timestamp creationTimestamp;
}
