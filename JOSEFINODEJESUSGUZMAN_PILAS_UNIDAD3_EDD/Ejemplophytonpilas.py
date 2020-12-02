# -*- coding: utf-8 -*-
"""
Created on Sun Oct 25 02:11:19 2020

@author: JOSE
"""

#pilas

pila=[1,2,3,4]
#agregando elementos por el final
pila.append(5)# se ocupa el metodo append para introducir nuevos datos
pila.append(6)

print(pila)# se imprime el mensaje

#sacando el elemento por el final

n=pila.pop()# se ocupa el metodo pop para borrar los valores y devolver sus valor
print(f"sacando el elemento{n}")# se imprime el mensaje con el valor de numero elimnado
n=pila.pop()
print(f"sacando el elemento{n}")

print(pila)# se immprime el mensaje de los valores 