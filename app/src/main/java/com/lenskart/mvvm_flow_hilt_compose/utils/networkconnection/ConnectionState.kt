package com.lenskart.mvvm_flow_hilt_compose.utils.networkconnection

sealed class ConnectionState {
    object Available : ConnectionState()
    object Unavailable : ConnectionState()
}