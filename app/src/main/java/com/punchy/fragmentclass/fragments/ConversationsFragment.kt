package com.punchy.fragmentclass.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.punchy.fragmentclass.R

class ConversationsFragment  : Fragment() {

    private lateinit var editName: TextView
    private lateinit var resultText: TextView
    private lateinit var executeButton: Button

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("life_cycle", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("life_cycle", "Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("life_cycle", "Fragment onCreateView")
        val view = inflater.inflate(
            R.layout.fragment_conversations,
            container,
            false
        )

        editName = view.findViewById(R.id.nameEdit)
        resultText = view.findViewById(R.id.nameText)
        executeButton = view.findViewById(R.id.executeButton)

        executeButton.setOnClickListener {
            resultText.text = editName.text
        }

//        view.findViewById<Button>()
        //Processamento de visualizacao
        return view
    }

    //on Activity Created is deprecated
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("life_cycle", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("life_cycle", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("life_cycle", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("life_cycle", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("life_cycle", "Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("life_cycle", "Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("life_cycle", "Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("life_cycle", "Fragment onDetach")
    }

}