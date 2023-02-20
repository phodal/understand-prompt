from transformers import AutoTokenizer, AutoModelForCausalLM

# 可以直接从服务器端下载
# tokenizer = AutoTokenizer.from_pretrained("Salesforce/codegen-6B-mono")
# model = AutoModelForCausalLM.from_pretrained("Salesforce/codegen-6B-mono")

# 或者用下载到本地的版本
tokenizer = AutoTokenizer.from_pretrained("/Volumes/game/codeai/ai-research/diff-codegen-6b-v2")
model = AutoModelForCausalLM.from_pretrained("/Volumes/game/codeai/ai-research/diff-codegen-6b-v2")

text = "def hello_world():"
input_ids = tokenizer(text, return_tensors="pt").input_ids

generated_ids = model.generate(input_ids, max_length=128)
print(tokenizer.decode(generated_ids[0], skip_special_tokens=True))
