# K번째수
- 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.

## 코드
- 
```
def solution(array, commands):
    answer = []
    for i in commands:
        answer.append(sorted(array[i[0]-1:i[1]])[i[2]-1])
    return answer
```

## 풀이
- array를 slicing하는 과정을 먼저 거쳐야하기 때문에 array[i[0]-1:i[1]]을 수행하고 오름차순으로 정렬을 하기 위해 sorted함수를 사용하였다. sorted함수는 기존의 리스트를 변경하는 것이 아니라 정렬된 새로운 리스트로 반환해주는 함수이고 이 정렬된 리스트에서 K번째 수를 찾아 answer 리스트에 append()를 사용하여 리스트에 추가한다. append()함수는 리스트 뒤에 수를 추가하는 함수이다. 

## 다른사람 코드
- 
```
def solution(array, commands):
    return list(map(lambda x:sorted(array[x[0]-1:x[1]])[x[2]-1], commands))
```

## 해석
- 
한 줄로 정말 간결하게 잘 짰다고 생각이 들었고 이 중 map함수와 lambda함수를 자세하게 볼 필요가 있다. 
map 함수는 
