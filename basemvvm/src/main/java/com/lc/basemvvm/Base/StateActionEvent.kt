package com.lc.basemvvm.Base

//定义网络请求状态(密封类扩展性更好)
sealed class StateActionEvent

object LoadState : StateActionEvent()

object SuccessState : StateActionEvent()

class ErrorState(val message: String?) : StateActionEvent()