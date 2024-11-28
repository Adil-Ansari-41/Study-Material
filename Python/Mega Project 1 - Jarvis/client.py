from openai import OpenAI
client = OpenAI(
    api_key="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",
)

completion = client.chat.completions.create(
    model="gpt-4o-mini",
    messages=[
        {"role": "system", "content": "You are a virtual assistant named jarvis skilled in general task like Alex and Google Cloud"},
        {
            "role": "user",
            "content": "What is coding"
        }
    ]
)

print(completion.choices[0].message.content)



#pip install openai