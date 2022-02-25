from Arbol.Nodo import Nodo


class Arbol:
    Nodo.raiz
       
           
def insertar(raiz, nodo):
    if raiz is None:
        raiz = nodo
    else:
        if raiz.dato < nodo.dato:
             if raiz.Dcho is None:
                  raiz.Dcho = nodo
             else:
                 insertar(raiz.Dcho, nodo)
        else:
            if raiz.Zda is None:
                 raiz.Zda = nodo
            else:
                insertar(raiz.Zda, nodo)

def insertar(self, padre = None, dato = None):
    if dato >padre.ValorNodo():
        if self.padre.GetSubarbolDcho() == None:
            self.padre.SetRamaIzda(Nodo(dato))
        else:
            if self.padre.GetSubarbolizdo() == None:
                self.padre.SetRamaIzda(Nodo(dato))
            else:
                insertar(padre.Getsubarbolizdo(),dato)







       

