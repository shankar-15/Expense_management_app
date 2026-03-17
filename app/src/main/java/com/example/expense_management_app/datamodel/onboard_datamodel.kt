package com.example.expense_management_app.datamodel


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class OnboardingItem(
    val title: String,
    val description: String,
    val icon: ImageVector
)

val onboardingItems = listOf(
    OnboardingItem(
        "Track Expenses Easily",
        "Add and manage your daily expenses in seconds.",
        Icons.Default.Receipt
    ),
    OnboardingItem(
        "AI Insights",
        "Get smart suggestions based on your spending habits.",
        Icons.Default.Analytics
    ),
    OnboardingItem(
        "Save More",
        "Control your budget and achieve your financial goals.",
        Icons.Default.Savings
    )
)