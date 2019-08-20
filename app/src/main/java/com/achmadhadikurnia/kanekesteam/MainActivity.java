package com.achmadhadikurnia.kanekesteam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewTeam;
    private ArrayList<Team> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.about, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTeam = findViewById(R.id.recyclerView_team);
        recyclerViewTeam.setHasFixedSize(true);

        list.addAll(TeamData.getListData());
        showRecyclerList();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.button_about) {
            startActivity(new Intent(this, AboutActivity.class));
        }

        return true;
    }

    private void showSelectedTeam(Team team) {
        Intent moveWithDataIntent = new Intent(MainActivity.this, AboutActivity.class);
        moveWithDataIntent.putExtra(AboutActivity.AUTHOR_AVATAR, team.getPhoto());
        moveWithDataIntent.putExtra(AboutActivity.AUTHOR_NAME, team.getName());
        moveWithDataIntent.putExtra(AboutActivity.AUTHOR_JOBTITLE, team.getJob());
        moveWithDataIntent.putExtra(AboutActivity.AUTHOR_EMAIL, team.getEmail());
        startActivity(moveWithDataIntent);
    }

    protected void showRecyclerList() {
        recyclerViewTeam.setLayoutManager(new LinearLayoutManager(this));
        TeamListAdaptor teamListAdaptor = new TeamListAdaptor(list);
        recyclerViewTeam.setAdapter(teamListAdaptor);

        TeamListAdaptor.setOnItemClickCallback(new TeamListAdaptor.OnItemClickCallback() {
            @Override
            public void onItemClicked(Team data) {
                showSelectedTeam(data);
            }
        });
    }
}
