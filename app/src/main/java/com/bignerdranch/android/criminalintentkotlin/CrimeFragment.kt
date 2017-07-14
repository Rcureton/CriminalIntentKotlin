package com.bignerdranch.android.criminalintentkotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.bignerdranch.android.criminalintentkotlin.databinding.FragmentCrimeBinding
import java.util.*

class CrimeFragment : Fragment() {

    private var crime = Crime(UUID.randomUUID(),"", Date(), false)
    private lateinit var mBinding: FragmentCrimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_crime, container, false)

        mBinding.crimeDate.text = crime.date.toString()
        mBinding.crimeDate.isEnabled

        mBinding.crimeSolved.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, isSolved: Boolean) {
               crime.solved = isSolved

            }

        })

        mBinding.crimeTitle.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

        return mBinding.root
    }
}
