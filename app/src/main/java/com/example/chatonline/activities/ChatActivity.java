package com.example.chatonline.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatonline.R;
import com.example.chatonline.databinding.ActivityChatBinding;
import com.example.chatonline.models.User;
import com.example.chatonline.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadReceiveDetails();
    }
    private void  loadReceiveDetails(){
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListener(){
        binding.imageBack.setOnClickListener(v -> onBackPressed());
    }
}