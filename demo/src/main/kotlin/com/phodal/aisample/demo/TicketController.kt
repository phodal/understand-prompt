package com.phodal.aisample.demo

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



/**
 * all apis
 * | API    | 描述             | HTTP方法 | URL                                           | 参数     | 返回值         |
 * |--------|----------------|--------|-----------------------------------------------|--------|-------------|
 * | 创建订单   | 创建一个新的订单       | POST   | /ticket-orders                                | 创建订单信息 | 订单ID        |
 * | 查询订单   | 查询一个已存在的订单     | GET    | /ticket-orders/{orderId}                      | 订单ID   | 订单信息        |
 * | 取消订单   | 取消一个已存在的订单     | DELETE | /ticket-orders/{orderId}                      | 订单ID   | 取消成功或失败信息   |
 * | 添加座位   | 向一个已存在的订单添加座位  | POST   | /ticket-orders/{orderId}/seats                | 座位信息   | 座位添加成功或失败信息 |
 * | 移除座位   | 从一个已存在的订单中移除座位 | DELETE | /ticket-orders/{orderId}/seats/{seatId}       | 座位ID   | 座位移除成功或失败信息 |
 * | 查询可用座位 | 查询某个场次电影的可用座位  | GET    | /cinema-schedule/{scheduleId}/available-seats | 场次ID   | 可用座位信息      |
 */
@RestController
@RequestMapping("ticket-orders")
class TicketController(
    val ticketService: TicketService,
    val tickerOrderApplicationService: TickerOrderApplicationService,
    val cinemaScheduleService: CinemaScheduleService
) {
    @PostMapping
    fun createTicketOrder(@RequestBody ticketOrder: TicketOrder): String {
        // check the schedule is valid, the seats are available, then create the order, if the schedule is not valid, throw NotScheduleAvailableException
        // check the schedule is valid
        val schedule = cinemaScheduleService.getSchedule(ticketOrder.scheduleId)
        if (schedule == null) {
            throw NotScheduleAvailableException()
        }
        // check the seats are available
        val availableSeats = cinemaScheduleService.getAvailableSeats(ticketOrder.scheduleId)
        if (!availableSeats.containsAll(ticketOrder.seats)) {
            throw NotSeatAvailableException()
        }
        // create order
        return tickerOrderApplicationService.createOrder(ticketOrder)
    }

}