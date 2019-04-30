package com.alexdo.projects.debtninja.ui.receipt;

import android.arch.lifecycle.ViewModel;

import java.sql.Timestamp;

public class ReceiptViewModel extends ViewModel {
    private String creator;
    private Double total;
    private Double debt;
    private String title;
    private Timestamp creationTimestamp;
}
