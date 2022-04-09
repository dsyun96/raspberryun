package dev.yuni.water.controller.exception

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class GlobalExceptionHandler {
    final val DEFAULT_ERROR_VIEW = "error"

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleIllegalArgumentException(
        request: HttpServletRequest,
        exception: IllegalArgumentException
    ): ModelAndView {
        val mav = ModelAndView()
        mav.addObject("exception", exception)
        mav.addObject("url", request.requestURL)
        mav.viewName = DEFAULT_ERROR_VIEW

        return mav
    }
}