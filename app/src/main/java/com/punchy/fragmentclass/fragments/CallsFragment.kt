package com.punchy.fragmentclass.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.punchy.fragmentclass.R
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CallsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CallsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var user: String? = null
    private var region: String? = null
    private var cellphone: String? = null


    private lateinit var userText: TextView
    private lateinit var regionText: TextView
    private lateinit var cellphoneText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            user = it.getString("user")
            region = it.getString("region")
            cellphone = it.getString("cellphone")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_calls, container, false)

        userText = view.findViewById(R.id.userText)
        regionText = view.findViewById(R.id.regionText)
        cellphoneText = view.findViewById(R.id.cellphoneText)

        userText.text = user
        regionText.text = region
        cellphoneText.text = cellphone


        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                CallsFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}