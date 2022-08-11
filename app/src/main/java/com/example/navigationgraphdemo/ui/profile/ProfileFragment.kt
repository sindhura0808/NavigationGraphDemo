package com.example.navigationgraphdemo.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.navigationgraphdemo.R
import com.example.navigationgraphdemo.databinding.FragmentHomeBinding
import com.example.navigationgraphdemo.databinding.FragmentProfileBinding
import com.example.navigationgraphdemo.ui.home.HomeViewModel

class ProfileFragment: Fragment() {
   lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        val emailid=arguments?.getString("email_id")?:"NA"
        val imageId=arguments?.getInt("profile")?: R.drawable.ic_menu_camera
        binding.tvName.text=emailid
        binding.profilrpic.setImageDrawable(resources.getDrawable(imageId))
        binding.btnGoToGallery.setOnClickListener{
            val navController=findNavController()
            navController.navigate(R.id.action_nav_profile_to_nav_gallery)

        }

        return binding.root
    }


}