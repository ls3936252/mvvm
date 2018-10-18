package com.mvvm.solo.myapplication.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mvvm.solo.myapplication.R;
import com.mvvm.solo.myapplication.baseUI.BaseActivity;
import com.mvvm.solo.myapplication.bean.User;
import com.mvvm.solo.myapplication.databinding.ActivityMainBinding;
import com.mvvm.solo.myapplication.event.UserEvent;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("ls", 18);
        binding.setUser(user);
        String[] arrays = new String[]{"数组1", "数组2", "数组3"};
        binding.setArrayIndex(0);
        binding.setArray(arrays);
        ArrayList<String> list = new ArrayList<>();
        list.add("列表1");
        list.add("列表2");
        list.add("列表3");
        binding.setListIndex(1);
        binding.setList(list);
        HashMap<String, String> map = new HashMap<>();
        map.put("hash1", "键值对1");
        map.put("hash2", "键值对2");
        map.put("hash3", "键值对3");
        binding.setKey("hash3");
        binding.setMap(map);
        binding.setMHandler(new UserEvent());

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View v) {

    }
}

