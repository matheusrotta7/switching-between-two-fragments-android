package com.punchy.fragmentclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import com.punchy.fragmentclass.fragments.CallsFragment
import com.punchy.fragmentclass.fragments.ConversationsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var conversationButton: Button
    private lateinit var callsButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        conversationButton = findViewById(R.id.conversation_button)
        callsButton = findViewById(R.id.calls_button)

        conversationButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_content, ConversationsFragment())
                .commit()
        }

        callsButton.setOnClickListener {
            val callsFragment = CallsFragment()
            callsFragment.arguments = bundleOf(
                "user" to "matheus",
                "region" to "Brazil",
                "cellphone" to "(19) 99193-8483"
            )

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_content, callsFragment)
                .commit()
        }


        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_content, ConversationsFragment())
            .commit()

    }
}