class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        if len(prerequisites) == 0:
            return True
        in_degree = [0] * numCourses
        adj = defaultdict(list)
        for i in range(len(prerequisites)):
            adj[prerequisites[i][0]].append(prerequisites[i][1])
            in_degree[prerequisites[i][1]] += 1
        dq = deque([i for i in range(numCourses) if in_degree[i] == 0])   

        ob = 0 

        while dq:
            ob+=1
            x = dq.popleft()
            l = adj[x]
            for i in l:
                in_degree[i] -= 1
                if in_degree[i] == 0:
                    dq.append(i)
        return ob == numCourses

        
        