d = {}
s = """서울시 구로구 | 2020-12-22
    #[잠이온다] #[어떡하지] #[자고 할까] #[배고프다]"""
lines = s.split('\n')
# lines[0] 서울시 구로구 | 2020-12-22
# lines[1] #[잠이온다] #[어떡하지] #[자고 할까] #[배고프다]

place, date = lines[0].split('|')
d['place'] = place.strip()
d['date'] = date.strip()
tags = lines[1].split('#')
tags = tags[1:]

def f(s):
    s = s.strip()
    return s[1:-1]

l = list(map(f,tags))

d['tags'] = l
print(d)