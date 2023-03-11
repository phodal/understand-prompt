# ClickPrompt

我们是 ClickPrompt 开源项目的贡献者，我们想让你为 ClickPrompt 添加一些新的功能。开始之前请阅读一下这些资料：

- ClickPrompt 是一款专为 Prompt 编写者设计的工具，它支持多种基于 Prompt 的 AI 应用，例如 Stable Diffusion、ChatGPT 和 GitHub Copilot 等。 使用 ClickPrompt，您可以轻松地查看、分享和一键运行这些模型，同时提供在线的 Prompt 生成器，使用户能够根据自己的需求轻松创建符合要求的 Prompt，并与其他人分享。
- ClickPrompt 包含了些页面组件：chatgpt、chatgpt-general、chatgpt-generator-cot、chatgpt-interactive-game、chatgpt-prompt-role-play、chatgpt-samples、chatgpt-startling-by-each-step、github-copilot-samples、resources、stable-diffusion-examples、stable-diffusion-generator
- ClickPrompt 使用 Next.js、React、Chakra UI、Tailwind 等作为主要的开发框架，使用 Planetscale 作为数据库。


现在，我们想让你：结合 ClickPrompt 的功能与 reactour 为 ClickPrompt 的首页，添加一个 Tour guide 的功能


以下是首页的主要代码：

````
 <body>
    <Provider>
      {/* https://github.com/vercel/next.js/issues/42292 */}
      {/* @ts-expect-error Async Server Component */}
      <NavBar locale={lang} />
      <Container maxW='8xl' p={{ md: "2rem", base: "1rem" }}>
        {children}
      </Container>
    </Provider>
    <div className='flex justify-center py-4'>
      <a
        className='flex gap-4 items-center'
        href='https://vercel.com?utm_source=prompt-engineering&utm_campaign=oss'
        target={"_blank"}
      >
        <span>Powered by</span>
        <Image
          height={24}
          width={116}
          src='https://images.ctfassets.net/e5382hct74si/78Olo8EZRdUlcDUFQvnzG7/fa4cdb6dc04c40fceac194134788a0e2/1618983297-powered-by-vercel.svg'
          alt='Vercel Logo'
        />
      </a>
    </div>
    <AnalyticsWrapper />
  </body>
```


应该如何修改？直接给个示例？
