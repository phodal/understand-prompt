# 代码生成

模型：https://huggingface.co/Salesforce/codegen-6B-mono

CarpserAI： https://huggingface.co/CarperAI/diff-codegen-6b-v2

安装 Transformers:

```bash
pip install -i https://testpypi.python.org/pypi transformers
```

测试安装：

```
python -c "from transformers import pipeline; classifier = pipeline('text-classification'); print(classifier('What a nice release'))"
```

代码：

测试代码：

```python
from transformers import AutoTokenizer, AutoModelForCausalLM
tokenizer = AutoTokenizer.from_pretrained("Salesforce/codegen-6B-mono")
model = AutoModelForCausalLM.from_pretrained("Salesforce/codegen-6B-mono")

text = "def hello_world():"
input_ids = tokenizer(text, return_tensors="pt").input_ids

generated_ids = model.generate(input_ids, max_length=128)
print(tokenizer.decode(generated_ids[0], skip_special_tokens=True))
```
