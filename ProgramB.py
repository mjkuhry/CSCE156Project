# -*- coding: utf-8 -*-
"""
Created on Sun Jul 21 15:28:59 2019

@author: Matthew
"""
#import numpy
import networkx as nx
import sys

G = nx.Graph()
f = open(sys.argv[1], "r")
i=0

#function for hamwalk(), need to pass in a vertex
def hamilton_walk(path, G, k):
    if k == G.size():
        s = "Hamiltonian Path: "
        for p in path:
            s = s + str(p) + " "
        print(s)
        return True
        #print(": ")
        #for num in path:
        #    print(num, " ")
        #print("\n")
    else:  
        #print("Neighbors of ", k, ": ", G.neighbors(k))
        nlist = G.neighbors(int(path[k]))#gets neighbors of recent path
        for node in nlist:#get edges from last node in path
            if node not in path:#if the new node is not contained in the path
                #calls hamilton walk with new node appended to the path
                path.append(node)
                return hamilton_walk(path, G, k+1)
    

#parser
for line in f:
    if i == 0:
        #set n equal to the number of nodes
        n = int(line)
    else:
        list = line.split()
        j=0
        #add each node into the 
        for num in list:
            if j==0:
                G.add_node(int(list[0]))#TODO: nodes NOT being added correctly
            else:
                #print("Edge: ", list[0], "-", num, "added! \n")
                G.add_edge(int(list[0]), int(num))
            j=j+1
    i=i+1

#t("NODES: ", G.nodes())
f.close()


hp = False
for node in range(0,n):#iterates through the nodes based on their number
    k=0
    l = []
    l.append(node)
    if hamilton_walk(l,G,k) == True:
        hp = True
        break
if hp == False:
    print("No Hamiltonian Path")
        
#print(G.nodes)