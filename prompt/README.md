#  从 Prompt Engineering 到 Prompt 编程

在人类世界里，我们是由概念构建的，语言本身就是在解释概念。在 AI 世界里，它也是类似的：

> prompt 通常指的是一个输入的文本段落或短语，作为生成模型输出的起点或引导。prompt 可以是一个问题、一段文字描述、一段对话或任何形式的文本输入，模型会基于 prompt 所提供的上下文和语义信息，生成相应的输出文本。举个例子，对于一个语言模型，prompt 可以是 "The cat sat on the"，模型可以通过对接下来的词语进行预测，生成类似于 "mat"、"chair"、"sofa" 等不同的输出。Prompt 在人工智能语言生成领域中扮演着重要的角色，因为它可以帮助模型更好地理解用户意图，并生成更准确、有意义的文本内容。

对应的 Prompt 工程则是：

> Prompt 工程是一种基于机器学习的自然语言处理技术，旨在生成高质量的文本内容，例如文章、评论、电子邮件、答案等。Prompt 工程通常使用深度学习模型，如生成对抗网络 (GAN)、循环神经网络 (RNN)、BERT 等，通过对大量文本数据进行训练，模型能够学习到自然语言的语法和语义规则，并根据输入的提示 (prompt) 生成相关的文本内容。Prompt 工程可以应用于多种场景，例如自动化写作、机器人客服、虚拟助手等。

![Prompt Enginneering](https://files.readme.io/384b77e-PromptEngineering_Visual_1.svg)


## 策略：Task specification

来源：[Methods of prompt programming](https://generative.ink/posts/methods-of-prompt-programming/#metaprompt-demonstrations)

## 元素模式

### By Instruction

> `翻译`、`告诉我`

phodal： 定义一下 prompt 工程 



### By proxy

### By demonstration

![](https://files.readme.io/3e99dda-PromptEngineering_Visual_3.svg)

## 混合模式


###  Role Play

在 [Awesome ChatGPT Prompts](https://github.com/f/awesome-chatgpt-prompts) 中：

> Human: Act as a Linux Terminal

Robot: 

> ChatGPT: I want you to act as a linux terminal. I will type commands and you will reply with what the terminal should show. I want you to only reply with the terminal output inside one unique code block, and nothing else. do not write explanations. do not type commands unless I instruct you to do so. When I need to tell you something in English, I will do so by putting text inside curly brackets {like this}. My first command is pwd



## 相关资源 Prompt Engineering

- [Awesome Prompt Engineering](https://github.com/promptslab/Awesome-Prompt-Engineering)
- [Awesome ChatGPT Prompts](https://github.com/f/awesome-chatgpt-prompts)

### Code

- https://github.com/microsoft/prompt-engine, This repo contains an NPM utility library for creating and maintaining prompts for Large Language Models (LLMs).

### 安全问题

- Prompt injection: [Exploring Prompt Injection Attacks])(https://research.nccgroup.com/2022/12/05/exploring-prompt-injection-attacks/)


### 相关文章

 - [How to get Codex to produce the code you want!](https://microsoft.github.io/prompt-engineering/)

