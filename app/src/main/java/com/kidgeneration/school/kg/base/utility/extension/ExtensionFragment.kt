package com.kidgeneration.school.kg.base.utility.extension

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.view.ActivityMain

fun Fragment.string(id: Int) = getString(id)

fun Fragment.homeBackButton(visible: Boolean = true) {
    activity?.let {
        (it as ActivityMain).homeBackButton(visible = visible)
    }
}

fun Fragment.homeOptionMenu(visible: Boolean = false) {
    activity?.let {
        (it as ActivityMain).homeOptionMenu(visible = visible)
    }
}

fun Fragment.setTitle(title: String? = null) {
    activity?.title = title ?: name(id = R.string.app_name)
}

fun Fragment.setTitle(id: Int) {
    activity?.title = name(id = id)
}

fun Fragment.name(id: Int): String {
    return getString(id)
}

private fun Fragment.findNavController(): NavController =
    NavHostFragment.findNavController(this)

fun Fragment.navigateTo(actionId: Int) {
    findNavController().navigateWithAnim(
        actionId = actionId
    )
}


//fun Fragment.navigate(actionId: Int, document: Module? = null) {
//    val bundle = bundleOf("document" to document)
//    navigateTo(
//        actionId = actionId,
//        args = bundle
//    )
//}
//
//fun Fragment.navigateTo(document: Module) = toModule(document)
//
//fun Fragment.navigateToAdd(document: Module) = toModule(document)
//
//fun Fragment.navigateToDetails(document: Module) = toDetails(document)
//
//private fun toModule(document: Module) {
//    when (document.moduleName) {
//        MODULE_ACTIVITY -> navigate(R.id.fragmentActivities)
//        MODULE_ALERT -> navigate(R.id.fragmentAlert)
//    }
//}
//
//private fun toDetails(document: Module) {
//    when (document.moduleName) {
//        MODULE_ACTIVITY -> navigate(
//            actionId = R.id.toFragmentActivitiesDetails,
//            document = document
//        )
//    }
//}

