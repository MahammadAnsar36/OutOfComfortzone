from nltk.corpus import stopwords
from collections import Counter
nltk.download('stopwords')
words = ['this', 'is', 'a', 'sample', 'text', 'sample']
stop_words = set(stopwords.words('english'))
freq = Counter(words)
filtered = [w for w in words if w not in stop_words and freq[w] > 1]
print(filtered)
