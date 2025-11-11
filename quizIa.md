# Solución Manual - Propagación hacia Adelante

## Datos Iniciales

**Matrices de pesos:**
$$W^{(o)} = \begin{bmatrix} 0 & 0.85 & 0.1 \\ 0 & 0.7 & 0.7 \\ 0 & 0.6 & 0.2 \end{bmatrix}$$

$$W^{(s)} = \begin{bmatrix} 0.3 & 0.35 & 0.9 \\ 0.2 & 0.9 & 0.5 \\ 0.2 & 0.6 & 0.8 \end{bmatrix}$$

**Dataset:**
$$X = \begin{bmatrix} 1 & 50 & 20 \\ 1 & 52 & 19 \\ 1 & 2 & 3 \end{bmatrix}, \quad T = \begin{bmatrix} 1 & 0 & 0 \\ 1 & 0 & 0 \\ 0 & 1 & 0 \end{bmatrix}$$

---

## MUESTRA 1: x₁ = [1, 50, 20], t₁ = [1, 0, 0]

### Paso 1: Capa Oculta - Cálculo de z^(o)

$$z^{(o)} = W^{(o)} \times x_1 = \begin{bmatrix} 0 & 0.85 & 0.1 \\ 0 & 0.7 & 0.7 \\ 0 & 0.6 & 0.2 \end{bmatrix} \times \begin{bmatrix} 1 \\ 50 \\ 20 \end{bmatrix}$$

Calculando cada componente:
- $z_1^{(o)} = 0(1) + 0.85(50) + 0.1(20) = 0 + 42.5 + 2 = 44.5$
- $z_2^{(o)} = 0(1) + 0.7(50) + 0.7(20) = 0 + 35 + 14 = 49$
- $z_3^{(o)} = 0(1) + 0.6(50) + 0.2(20) = 0 + 30 + 4 = 34$

$$z^{(o)} = \begin{bmatrix} 44.5 \\ 49 \\ 34 \end{bmatrix}$$

### Paso 2: Aplicar tanh

$$a^{(o)} = \tanh(z^{(o)})$$

Para cada componente usando $\tanh(x) = \frac{e^x - e^{-x}}{e^x + e^{-x}}$:

- $a_1^{(o)} = \tanh(44.5) = \frac{e^{44.5} - e^{-44.5}}{e^{44.5} + e^{-44.5}} \approx 1.0$ (valor muy cercano a 1)
- $a_2^{(o)} = \tanh(49) \approx 1.0$
- $a_3^{(o)} = \tanh(34) \approx 1.0$

$$a^{(o)} \approx \begin{bmatrix} 1.0 \\ 1.0 \\ 1.0 \end{bmatrix}$$

### Paso 3: Capa de Salida - Cálculo de z^(s)

$$z^{(s)} = W^{(s)} \times a^{(o)} = \begin{bmatrix} 0.3 & 0.35 & 0.9 \\ 0.2 & 0.9 & 0.5 \\ 0.2 & 0.6 & 0.8 \end{bmatrix} \times \begin{bmatrix} 1.0 \\ 1.0 \\ 1.0 \end{bmatrix}$$

Calculando:
- $z_1^{(s)} = 0.3(1) + 0.35(1) + 0.9(1) = 0.3 + 0.35 + 0.9 = 1.55$
- $z_2^{(s)} = 0.2(1) + 0.9(1) + 0.5(1) = 0.2 + 0.9 + 0.5 = 1.6$
- $z_3^{(s)} = 0.2(1) + 0.6(1) + 0.8(1) = 0.2 + 0.6 + 0.8 = 1.6$

$$z^{(s)} = \begin{bmatrix} 1.55 \\ 1.6 \\ 1.6 \end{bmatrix}$$

### Paso 4: Aplicar función identidad

$$y^{(s)} = g^{(s)}(z^{(s)}) = z^{(s)} = \begin{bmatrix} 1.55 \\ 1.6 \\ 1.6 \end{bmatrix}$$

### Paso 5: Calcular error E₁

$$e_1 = y^{(s)} - t_1 = \begin{bmatrix} 1.55 \\ 1.6 \\ 1.6 \end{bmatrix} - \begin{bmatrix} 1 \\ 0 \\ 0 \end{bmatrix} = \begin{bmatrix} 0.55 \\ 1.6 \\ 1.6 \end{bmatrix}$$

$$E_1 = \frac{1}{2}||e_1||^2 = \frac{1}{2}[(0.55)^2 + (1.6)^2 + (1.6)^2]$$
$$E_1 = \frac{1}{2}[0.3025 + 2.56 + 2.56] = \frac{1}{2}(5.4225) = 2.71125$$

---

## MUESTRA 2: x₂ = [1, 52, 19], t₂ = [1, 0, 0]

### Paso 1: Capa Oculta - Cálculo de z^(o)

$$z^{(o)} = W^{(o)} \times x_2 = \begin{bmatrix} 0 & 0.85 & 0.1 \\ 0 & 0.7 & 0.7 \\ 0 & 0.6 & 0.2 \end{bmatrix} \times \begin{bmatrix} 1 \\ 52 \\ 19 \end{bmatrix}$$

- $z_1^{(o)} = 0(1) + 0.85(52) + 0.1(19) = 0 + 44.2 + 1.9 = 46.1$
- $z_2^{(o)} = 0(1) + 0.7(52) + 0.7(19) = 0 + 36.4 + 13.3 = 49.7$
- $z_3^{(o)} = 0(1) + 0.6(52) + 0.2(19) = 0 + 31.2 + 3.8 = 35$

$$z^{(o)} = \begin{bmatrix} 46.1 \\ 49.7 \\ 35 \end{bmatrix}$$

### Paso 2: Aplicar tanh

$$a^{(o)} = \tanh(z^{(o)}) \approx \begin{bmatrix} 1.0 \\ 1.0 \\ 1.0 \end{bmatrix}$$

### Paso 3 y 4: Capa de Salida

Como las activaciones de la capa oculta son las mismas que en la muestra 1:

$$y^{(s)} = \begin{bmatrix} 1.55 \\ 1.6 \\ 1.6 \end{bmatrix}$$

### Paso 5: Calcular error E₂

$$e_2 = y^{(s)} - t_2 = \begin{bmatrix} 1.55 \\ 1.6 \\ 1.6 \end{bmatrix} - \begin{bmatrix} 1 \\ 0 \\ 0 \end{bmatrix} = \begin{bmatrix} 0.55 \\ 1.6 \\ 1.6 \end{bmatrix}$$

$$E_2 = \frac{1}{2}||e_2||^2 = 2.71125$$

---

## MUESTRA 3: x₃ = [1, 2, 3], t₃ = [0, 1, 0]

### Paso 1: Capa Oculta - Cálculo de z^(o)

$$z^{(o)} = W^{(o)} \times x_3 = \begin{bmatrix} 0 & 0.85 & 0.1 \\ 0 & 0.7 & 0.7 \\ 0 & 0.6 & 0.2 \end{bmatrix} \times \begin{bmatrix} 1 \\ 2 \\ 3 \end{bmatrix}$$

- $z_1^{(o)} = 0(1) + 0.85(2) + 0.1(3) = 0 + 1.7 + 0.3 = 2$
- $z_2^{(o)} = 0(1) + 0.7(2) + 0.7(3) = 0 + 1.4 + 2.1 = 3.5$
- $z_3^{(o)} = 0(1) + 0.6(2) + 0.2(3) = 0 + 1.2 + 0.6 = 1.8$

$$z^{(o)} = \begin{bmatrix} 2 \\ 3.5 \\ 1.8 \end{bmatrix}$$

### Paso 2: Aplicar tanh

Usando $\tanh(x) = \frac{e^x - e^{-x}}{e^x + e^{-x}}$:

- $a_1^{(o)} = \tanh(2) = \frac{e^2 - e^{-2}}{e^2 + e^{-2}} = \frac{7.389 - 0.135}{7.389 + 0.135} \approx \frac{7.254}{7.524} \approx 0.964$
- $a_2^{(o)} = \tanh(3.5) \approx \frac{e^{3.5} - e^{-3.5}}{e^{3.5} + e^{-3.5}} \approx \frac{33.115 - 0.030}{33.115 + 0.030} \approx 0.998$
- $a_3^{(o)} = \tanh(1.8) \approx \frac{e^{1.8} - e^{-1.8}}{e^{1.8} + e^{-1.8}} \approx \frac{6.050 - 0.165}{6.050 + 0.165} \approx 0.947$

$$a^{(o)} \approx \begin{bmatrix} 0.964 \\ 0.998 \\ 0.947 \end{bmatrix}$$

### Paso 3: Capa de Salida - Cálculo de z^(s)

$$z^{(s)} = W^{(s)} \times a^{(o)} = \begin{bmatrix} 0.3 & 0.35 & 0.9 \\ 0.2 & 0.9 & 0.5 \\ 0.2 & 0.6 & 0.8 \end{bmatrix} \times \begin{bmatrix} 0.964 \\ 0.998 \\ 0.947 \end{bmatrix}$$

- $z_1^{(s)} = 0.3(0.964) + 0.35(0.998) + 0.9(0.947) = 0.289 + 0.349 + 0.852 = 1.490$
- $z_2^{(s)} = 0.2(0.964) + 0.9(0.998) + 0.5(0.947) = 0.193 + 0.898 + 0.474 = 1.565$
- $z_3^{(s)} = 0.2(0.964) + 0.6(0.998) + 0.8(0.947) = 0.193 + 0.599 + 0.758 = 1.550$

$$z^{(s)} \approx \begin{bmatrix} 1.490 \\ 1.565 \\ 1.550 \end{bmatrix}$$

### Paso 4: Aplicar función identidad

$$y^{(s)} \approx \begin{bmatrix} 1.490 \\ 1.565 \\ 1.550 \end{bmatrix}$$

### Paso 5: Calcular error E₃

$$e_3 = y^{(s)} - t_3 = \begin{bmatrix} 1.490 \\ 1.565 \\ 1.550 \end{bmatrix} - \begin{bmatrix} 0 \\ 1 \\ 0 \end{bmatrix} = \begin{bmatrix} 1.490 \\ 0.565 \\ 1.550 \end{bmatrix}$$

$$E_3 = \frac{1}{2}||e_3||^2 = \frac{1}{2}[(1.490)^2 + (0.565)^2 + (1.550)^2]$$
$$E_3 = \frac{1}{2}[2.220 + 0.319 + 2.403] = \frac{1}{2}(4.942) = 2.471$$

---

## RESUMEN DE RESULTADOS

### Salidas de la red:
- **Muestra 1:** $y_1^{(s)} = [1.55, 1.6, 1.6]$
- **Muestra 2:** $y_2^{(s)} = [1.55, 1.6, 1.6]$
- **Muestra 3:** $y_3^{(s)} = [1.490, 1.565, 1.550]$

### Errores individuales:
- $E_1 = 2.711$
- $E_2 = 2.711$
- $E_3 = 2.471$

### Error total:
$$E(w) = E_1 + E_2 + E_3 = 2.711 + 2.711 + 2.471 = 7.893$$
