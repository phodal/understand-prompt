# Prompt 编程


## 概念对齐

phodal：知道 DDD 里的 ContextMap 吗？

chatgpt：……

phodal：知道 DSL（领域特定语言）吗？

chatgpt：……

phodal：设计一个 DSL 来表示 DDD 里的 Context Map 。


好的，下面是一个简单的 DSL 设计，用于表示 DDD 中的 Context Map：

```
ContextMap:
    Subdomain { Name: [subdomain_name] }
        [CollaboratesWith: [other_subdomain_name], ...]
        [ConformistWith: [other_subdomain_name], ...]
        [Antagonizes: [other_subdomain_name], ...]
    ...

```

上面的 DSL 中，ContextMap 表示整个上下文映射。每个 Subdomain 表示一个子域，Name 是子域的名称。子域之间的关系可以通过 CollaboratesWith（合作）、ConformistWith（一致）和 Antagonizes（对立）来描述。

例如，下面是一个包含两个子域之间关系的 Context Map 示例：


```
ContextMap:
    Subdomain { Name: "订单" }
        CollaboratesWith: "库存"
    Subdomain { Name: "库存" }
        Antagonizes: "订单"
```


这个例子中，"订单" 子域与 "库存" 子域合作，而 "库存" 子域对 "订单" 子域表示对立。

这只是一个简单的示例，实际上 DSL 的设计取决于具体的应用场景和需求，可以根据需要进行调整和扩展。但总体上，DSL 的目的是使 Context Map 更易于理解、表示和维护。

## 事件风暴

phodal：知道 DDD 里的事件风暴吗？

phodal：可以设计一个 DSL 来描述事件风暴的 事件建模 吗？

是的，下面是一个简单的事件风暴的事件建模的 DSL，它可以用来描述在事件风暴会议中识别和记录领域事件的过程。

css

EventStorming:
    Domain { Name: "领域名称" }
        Event { Name: "事件名称" }
            Triggered By: "触发该事件的因素"
            Description: "事件的详细描述"
            Actors: ["参与事件的主要角色"]
            Action: "在事件中执行的行为"
            Outcome: "事件触发后的结果"
        Event { Name: "另一个事件名称" }
            Triggered By: "触发该事件的因素"
            Description: "事件的详细描述"
            Actors: ["参与事件的主要角色"]
            Action: "在事件中执行的行为"
            Outcome: "事件触发后的结果"
        ...

在这个 DSL 中，我们首先定义了领域的名称，然后列出了所有的领域事件，每个事件都有以下属性：

    事件名称：表示该事件的名称或标识符。
    触发该事件的因素：表示该事件被触发的原因或条件。
    事件的详细描述：描述事件的细节和上下文。
    参与事件的主要角色：表示在事件中涉及的主要角色或参与者。
    在事件中执行的行为：表示在事件发生时执行的操作或行为。
    事件触发后的结果：表示事件触发后的影响或结果。

使用这个 DSL，我们可以将事件风暴会议中识别和记录的领域事件以清晰和一致的方式进行建模和记录。同时，这个 DSL 也可以作为团队之间沟通的基础，加强团队之间的协作和理解。


phodal：能用 事件建模的 DSL 来表示用户购票的流程吗？


是的，下面是一个简单的事件建模的 DSL，它可以用来描述用户购票的流程。

css

EventStorming:
    Domain { Name: "电影订票系统" }
        Event { Name: "用户提交订单" }
            Triggered By: "用户选择电影、场次、座位，确认订单"
            Description: "用户提交订单，包括所选电影、场次、座位等信息"
            Actors: ["用户"]
            Action: "将用户提交的订单信息保存到订单数据库中"
            Outcome: "订单状态被标记为已提交"
        Event { Name: "库存检查" }
            Triggered By: "订单状态被标记为已提交"
            Description: "检查所选场次的座位是否还有余量"
            Actors: ["库存管理系统"]
            Action: "查询座位库存信息"
            Outcome: "座位库存信息被更新"
        Event { Name: "订单确认" }
            Triggered By: "座位库存信息被更新"
            Description: "确认订单，将座位标记为已售出"
            Actors: ["库存管理系统"]
            Action: "更新座位库存信息，将座位标记为已售出"
            Outcome: "座位库存信息被更新，订单状态被标记为已确认"
        Event { Name: "支付确认" }
            Triggered By: "用户支付订单"
            Description: "用户完成支付"
            Actors: ["用户"]
            Action: "将支付信息保存到支付数据库中"
            Outcome: "支付状态被标记为已完成"
        Event { Name: "票据生成" }
            Triggered By: "订单状态被标记为已确认且支付状态被标记为已完成"
            Description: "生成电子票据，包括电影、场次、座位、价格等信息"
            Actors: ["票务系统"]
            Action: "根据订单信息生成电子票据"
            Outcome: "电子票据被生成"

在这个 DSL 中，我们定义了电影订票系统的领域名称，并列出了购票流程中的所有事件。每个事件都包含了事件名称、触发该事件的因素、事件的详细描述、参与事件的主要角色、在事件中执行的行为和事件触发后的结果。通过这个 DSL，我们可以清晰地描述用户购票的流程，包括用户提交订单、库存检查、订单确认、支付确认和票据生成等事件。同时，这个 DSL 也可以作为团队之间沟通的基础，加强团队之间的协作和理解。

phodal：能将上述的 用户购票 的流程转换为 Java 测试用例吗？

## 工程化

phodal：为电影订票系统设计一个 DDD 风格 Java 工程的代码目录结构。




