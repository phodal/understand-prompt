# AI 初研

新的 Macbook 采用的都是 A 卡，没有 CUDA：

```
pip install torch -f https://download.pytorch.org/whl/torch_stable.htm
```

以前是支持 ROCm：

![](https://pytorch.org/assets/images/amd_rocm_blog.png)

现在的版本不行了：

![](https://pytorch.org/get-started/locally/)

AI 社区：https://huggingface.co/

## AI 生成

Resources:

模型：https://huggingface.co/lllyasviel/ControlNet/tree/main/models

预编译：https://huggingface.co/kohya-ss/ControlNet-diff-modules

### SD

提示词 

solo, 1girl, portrait, looking at viewer, masterpiece, best quality, 4k, 8k,black_background,Simple background, 130mm f1.4 lens ,  (shiny skin:1.3),(vibrant colors), solo, (dalcefo, sakimistyle:1.1), (stare, realistic, lips, eyelashes:0.75), looking up, portrait, solo, upper body, good hand,4k, high-res, masterpiece, best quality, head:1.3,((Hasselblad photography)), finely detailed skin, sharp focus, (cinematic lighting), collarbone, morning, soft lighting, dynamic angle, [:(detailed face:1.2):0.2], medium breasts, cleavage, <lora:stLouisLuxuriousWheels_v1:1>,st. louis (luxurious wheels) (azur lane), hair ornament, earrings, necklace, portrait, silver dress, revealing clothes, looking at viewer, solo

负面提示词

(worst quality, low quality, extra digits:1.2), (mutated hands and fingers, missing fingers:1.3), dark skin, monochrome, naked,(bad_prompt_version2:1), distant view, lip, Pregnant, maternity, pointy ears, realistic, tan, muscular, greyscale, monochrome, lineart, 2koma, 3koma, 4koma, manga, 3D, 3Dcubism, pablo picasso, disney, marvel, mutanted breasts, mutanted nipple, cropped, lowres, bad anatomy, bad hands, text, error, missing fingers, extra digit, fewer digits, cropped, worst quality, low quality, normal quality, jpeg artifacts, signature, watermark, username, blurry, artist name, lowres, trademark, watermark, title, text, deformed, bad anatomy, disfigured, mutated, extra limbs, ugly, missing limb, floating limbs, disconnected limbs, out of frame, mutated hands and fingers, poorly drawn hands, malformed hands, poorly drawn face, poorly drawn asymmetrical eyes, (blurry:1.4), duplicate (loli, petite, child, infant, toddlers, chibi, sd character, teen age:1.4), tsurime, helmet hair, evil smile, smug_face, naughty smile, multiple view, Reference sheet, (worst quality, low quality:1.4),

#### 示例 2

real-sship anime screencap, 1girl, solo, blonde, hoodie, medium_hair, glasses, ((small_breasts)), cleavage, partially_unzipped, face, perfect, masterpiece, ((masterpiece, portrait, pixiv)), artstation, in a garden, increased, image clarity, ultradetalied, anime line, blackline, ufotable studio, <lora:dreamshaper_331BakedVae:1>
Negative prompt: bad anatomy, watermarks, text, signature, blur, messy, low quality, sketch by bad-artist, bad-image-v2-39000, necklace,
Steps: 22, Sampler: Euler a, CFG scale: 9, Seed: 524248806, Size: 512x512, Model hash: 89d59c3dde, Model: model, ControlNet Enabled: True, ControlNet Module: hed, ControlNet Model: control_hed-fp16 [13fee50b], ControlNet Weight: 1

Saved: 00006-524248806.png
